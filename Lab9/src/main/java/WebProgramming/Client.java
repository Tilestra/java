package WebProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client implements Runnable{

    private String message = null;

    public Client(String message){
        this.message = message;
    }

    @Override
    public void run() {
        Socket client = null;
        try {
            client = new Socket(Server.HOST, Server.PORT);

            try(InputStream in = client.getInputStream(); OutputStream out = client.getOutputStream()){
                out.write(message.getBytes());
                out.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int ConnectClients(){
        int threadCount = 3;
        for(int i = 0; i < 3; i++){
            Thread client = new Thread(new Client("Client" + i));
            client.start();
        }
        return threadCount;
    }
}
