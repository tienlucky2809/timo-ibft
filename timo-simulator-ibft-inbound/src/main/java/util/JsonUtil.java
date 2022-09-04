package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;


@Slf4j
public class JsonUtil {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static JsonNode buildJsonNode(String template) {
        try {
            File file = ResourceUtils.getFile("classpath:" + template);
            return mapper.readTree(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JsonNode toJsonNode(String json) {
        try {
            mapper.configure(
                    JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS.mappedFeature(),
                    true
            );
            return mapper.readTree(json);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setVal(JsonNode root, String keyPath, String val) {
        if (root == null || keyPath == null || "".equals(keyPath))
            return;

        String key = keyPath.substring(keyPath.lastIndexOf("/") + 1);
        String parentPath = keyPath.substring(0, keyPath.lastIndexOf("/"));

        // json chi co 1 level
        if ("".equals(parentPath)) {
            ObjectNode objNode = (ObjectNode) root;
            objNode.put(key, val);
            return;
        }

        if ("".equals(key))
            return;

        JsonNode parentNode = root.at(parentPath);
        if (parentNode == null || parentNode.isMissingNode())
            return;

        ObjectNode objNode = (ObjectNode) parentNode;
        objNode.put(key, val);

    }

    //For array
    public static void setVal(JsonNode root, String keyPath, String val, int index) {
        if (root == null || keyPath == null || "".equals(keyPath))
            return;

        String key = keyPath.substring(keyPath.lastIndexOf("/") + 1);
        String parentPath = keyPath.substring(0, keyPath.lastIndexOf("/"));

        // json chi co 1 level
        if ("".equals(parentPath)) {
            ObjectNode objNode = (ObjectNode) root;
            objNode.put(key, val);
            return;
        }

        if ("".equals(key))
            return;

        JsonNode parentNode = root.at(parentPath);
        if (parentNode == null || parentNode.isMissingNode())
            return;

        if (parentNode.isArray()) {
            ArrayNode arrNode = (ArrayNode) parentNode;
            arrNode.set(index, new TextNode(val));
        } else {
            ObjectNode objNode = (ObjectNode) parentNode;
            objNode.put(key, val);
        }
    }

    public static JsonNode getVal(JsonNode root, String keyPath) {
        if (root == null || keyPath == null || "".equals(keyPath))
            return null;

        return root.at(keyPath);
    }

    public static void remove(JsonNode root, String keyPath) {
        if (root == null || keyPath == null || "".equals(keyPath))
            return;

        String key = keyPath.substring(keyPath.lastIndexOf("/") + 1);
        String parentPath = keyPath.substring(0, keyPath.lastIndexOf("/"));

        System.out.println("parentPath: " + parentPath + ", key: " + key);
        if ("".equals(key) || "".equals(parentPath))
            return;

        JsonNode parentNode = root.at(parentPath);
        if (parentNode == null || parentNode.isMissingNode())
            return;

        JsonNode keyNode = parentNode.path(key);
        if (keyNode == null || keyNode.isMissingNode())
            return;

        ObjectNode objNode = (ObjectNode) parentNode;
        objNode.remove(key);
    }

    public static String escape(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // let's not put any nulls in our strings
            assert ((int) ch != 0);

            if (ch == '\n') {
                output.append("\\n");
            } else if (ch == '\t') {
                output.append("\\t");
            } else if (ch == '\r') {
                output.append("\\r");
            } else if (ch == '\\') {
                output.append("\\\\");
            } else if (ch == '"') {
                output.append("\\\"");
            } else if (ch == '\b') {
                output.append("\\b");
            } else if (ch == '\f') {
                output.append("\\f");
            } else if ((int) ch > 127) {
                output.append(String.format("\\u%04x", (int) ch));
            } else {
                output.append(ch);
            }
        }
        return output.toString();
    }

    public static String unescape(String input) {
        StringBuilder builder = new StringBuilder();

        int i = 0;
        while (i < input.length()) {
            char delimiter = input.charAt(i);
            i++; // consume letter or backslash

            if (delimiter == '\\' && i < input.length()) {

                // consume first after backslash
                char ch = input.charAt(i);
                i++;

                if (ch == '\\' || ch == '/' || ch == '"' || ch == '\'') {
                    builder.append(ch);
                } else if (ch == 'n')
                    builder.append('\n');
                else if (ch == 'r')
                    builder.append('\r');
                else if (ch == 't')
                    builder.append('\t');
                else if (ch == 'b')
                    builder.append('\b');
                else if (ch == 'f')
                    builder.append('\f');
                else if (ch == 'u') {

                    StringBuilder hex = new StringBuilder();
                    // expect 4 digits
                    if (i + 4 > input.length()) {
                        throw new RuntimeException("Not enough unicode digits! ");
                    }
                    for (char x : input.substring(i, i + 4).toCharArray()) {
                        if (!Character.isLetterOrDigit(x)) {
                            throw new RuntimeException("Bad character in unicode escape.");
                        }
                        hex.append(Character.toLowerCase(x));
                    }
                    i += 4; // consume those four digits.

                    int code = Integer.parseInt(hex.toString(), 16);
                    builder.append((char) code);
                } else {
                    throw new RuntimeException("Illegal escape sequence: \\" + ch);
                }
            } else { // it's not a backslash, or it's the last character.
                builder.append(delimiter);
            }
        }
        return builder.toString();
    }

    public static String writeObjectToString(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (Exception e) {

            log.error("Error parsing: " + object);
            log.error(e.toString());
            return "";
        }
    }

    public static <T> T readStringToObject(String objectString, Class<T> tClass) {
        try {
            return mapper.readValue(objectString, tClass);
        } catch (Exception e) {
            log.error("Error parsing string: {} to object: {} ", objectString, tClass.toString());
            return null;
        }

    }

    public static String parseObjectToStringJsonBeautiful(Object object) {
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            log.error("Parse error " + e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static String parseObjectToStringJson(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            log.error("Parse error " + e.getMessage());
            e.printStackTrace();
            return "";
        }
    }


}
