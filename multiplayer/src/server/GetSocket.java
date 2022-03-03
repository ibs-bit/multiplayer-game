package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class GetSocket {

    public static void main(String[] args) throws IOException
    {
        String host;
        String resource;

        if(args.length == 2)
        {
            host = args[0];
            resource = args[1];
        }
        else
        {
            System.out.println("Getting host");
            //host = // TODO
            resource =  "/" ;
        }

        // opening Socket

        final int PORT = 80;
        try(Socket s = new Socket(host, PORT))
        {
            // Get Streams
            InputStream instream = s.getInputStream();
            OutputStream outstream = s.getOutputStream();

            // implement scanner and writer for streams
            Scanner in = new Scanner(instream);
            PrintWriter out = new PrintWriter(outstream);

            // send GET request
            String command = "GET" + resource + "HTTP/1.1\n"+
                    "Host"+host+"\n\n";
            out.println(command);
            out.flush();

            while(in.hasNextLine())
            {
                String input = in.nextLine();
                System.out.println(input);
            }

        }
    }
}
