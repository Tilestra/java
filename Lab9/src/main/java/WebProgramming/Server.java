package WebProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static final int PORT = 8080;
    public static final String HOST = "localhost";


    public static void StartServer(int threadCount) {

        ServerSocket server = null;
        int clientCount = 0;
        System.out.println("Server started...\n");
        try {
            server = new ServerSocket(PORT);
            while (clientCount != threadCount) {
                Socket client = server.accept();
                System.out.println("Accepted client" + clientCount++);

                try (InputStream in = client.getInputStream(); OutputStream out = client.getOutputStream()) {
                    byte[] inpBytes = new byte[32 * 1024];
                    int readBytes = in.read(inpBytes);
                    String line = new String(inpBytes, 0, readBytes);
                    System.out.println("Client> " + line + '\n');
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
