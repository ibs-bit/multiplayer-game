package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer
{

    private ServerSocket serverSocket;
    private int player;
    private ServerThread player1;
    private ServerThread player2;
    private ServerThread player3;
    private ServerThread player4;


    //declare server port
    public MyServer()
    {
        player = 0;
        try
        {
            serverSocket = new ServerSocket(8888);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // method to accept connections for 4 players
    public void peerConnect()
    {
        try
        {
            while (player < 4) {

                Socket socket = serverSocket.accept();
                player++;

                System.out.println("Player " + player + " connected");

                // thread to connect players with sockets
                ServerThread serverThread = new ServerThread(socket, player);
                if (player == 1)
                {
                    player1 = serverThread;
                } else if (player == 2)
                {
                    player2 = serverThread;
                } else if (player == 3)
                {
                    player2 = serverThread;
                } else
                {
                    player4 = serverThread;
                }
                Thread thread = new Thread(serverThread);
                thread.start();
            }
            System.out.println("Sufficient players connected, Starting Game>>>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ServerThread implements Runnable
    {
        private Socket socket;
        private DataInputStream inStream;
        private DataOutputStream outStream;
        private int playerNum;

        public ServerThread(Socket s, int id)
        {
            socket = s;
            playerNum = id;
            try
            {
                inStream = new DataInputStream(socket.getInputStream());
                outStream = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void run()
        {
            try
            {
                outStream.writeInt(playerNum);
                outStream.flush();

                while(true)
                {

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[]args)
    {
        MyServer myServer = new MyServer();
        myServer.peerConnect();
    }
}
