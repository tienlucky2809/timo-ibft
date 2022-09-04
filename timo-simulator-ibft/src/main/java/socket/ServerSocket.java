package socket;

import model.DataModel;
import util.BuildResponseMsgUtil;
import util.DataMsgUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerSocket {

    private static final int PORT = 3333;

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
                    DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                    DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                    recvMsg = dataInputStream.readUTF();

                    System.out.println("Receive from GW : " + recvMsg.replace((char) 13, '|'));

                    DataModel dataModel = DataMsgUtil.buildDataModel(recvMsg);

                    switch (dataModel.getMti()) {
                        case "0800":
                            respMsg = BuildResponseMsgUtil.build0810Msg(dataModel);
                            break;
                        case "0200":
                            respMsg = BuildResponseMsgUtil.build0210Msg(dataModel);
                            break;
                        default:
                            System.out.println("Unknow mti");
                    }
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
