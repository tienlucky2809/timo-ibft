package util;

import common.AppConst;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class DateTimeUtil {

    public static String toString(LocalDateTime localDateTime, String pattern) {
        return localDateTime.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String toString(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDate toLocalDate(String localDateString, String pattern) {
        return LocalDate.parse(localDateString, DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDateTime toLocalDateTime(String localDateString, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(localDateString, formatter);
    }


    public static String genSessionId(String de012, String de013) {
        //de012 HHmmss, de013 MMdd
        try {
            String year = String.valueOf(LocalDateTime.now().getYear());
            LocalDateTime transTime = toLocalDateTime(de012 + de013 + year, "HHmmssMMddyyyy");
            if (transTime.toLocalTime().isBefore(LocalTime.of(23, 0, 0))) {
                return toString(transTime.toLocalDate(), AppConst.SESSION_PATTERN);
            }
            LocalDate transDateTomorrow = transTime.toLocalDate().plusDays(1);
            return toString(transDateTomorrow, AppConst.SESSION_PATTERN);
        } catch (Exception ex) {
            log.error("Generate session Id is error, check de012: {}, de013: {} , exception: {}", de012, de013, ex.getMessage());
            return StringUtils.EMPTY;
        }
    }

//    public static void main(String[] args) {
//        log.info(genSessionId("1747", "1014"));
//    }

}
