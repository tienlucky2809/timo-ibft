package socket;

import model.DataModel;
import util.BuildResponseMsgUtil;
import util.DataMsgUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerSocket {

    private static final int PORT = 3344;

    public static void main(String[] args) {
        java.net.ServerSocket serverSocket = null;
        Socket socket = null;
        RunServer:
        while (true) {
            try {
                serverSocket = new java.net.ServerSocket(PORT);
                System.out.println("server socket is running on port : " + PORT);
                String recvMsg = "";
                String respMsg = "";
                while (true) {
                    socket = serverSocket.accept();
                    System.out.println("client connected ");
                    DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                    respMsg = BuildResponseMsgUtil.buildInbound0200();
                    System.out.println("Send to GW : " + respMsg.replace((char) 13, '|'));
                    dataOutputStream.writeUTF(respMsg);
                    System.out.println("-------------------------END---------------------------");
                }
            } catch (Exception e) {
                System.out.println("Socket server error : " + e.toString());
                try {
                    closeSocket(serverSocket, socket);
                } catch (Exception ex) {
                }
                continue RunServer;
            }
        }
    }

    public static void closeSocket(java.net.ServerSocket serverSocket, Socket socket) throws IOException {
        if (socket != null && !socket.isClosed()) {
            socket.close();
        }
        if (serverSocket != null && !serverSocket.isClosed()) {
            serverSocket.close();
        }
    }

    public static void closeIOStream(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        if (dataInputStream != null) dataInputStream.close();
        if (dataOutputStream != null) dataInputStream.close();
    }
}
