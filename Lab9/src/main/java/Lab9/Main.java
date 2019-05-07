package Lab9;


import WebProgramming.Client;
import WebProgramming.Server;

public class Main {

    public static void main(String[] args) {

        Task.ExecuteTasks();

        Server.StartServer(Client.ConnectClients());
    }
}
