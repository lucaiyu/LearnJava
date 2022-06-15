package main.java.com.lucaiyu.learnjava.NetWorking;

import java.net.*;
import java.io.*;

public class Server extends Thread
{
    private ServerSocket serverSocket;

    public Server(int port) throws IOException
    {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Waiting Port is:" + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("Server Address:" + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Connect successful:" + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            }catch(SocketTimeoutException s)
            {
                System.out.println("Socket timed out!");
                break;
            }catch(IOException e)
            {
                e.printStackTrace();
                break;
            }
        }
    }
    public static void main(String [] args)
    {
        int port = Integer.parseInt(args[0]);
        try
        {
            Thread t = new Server(port);
            t.run();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}