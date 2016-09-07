/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author garn3_000
 */
import java.net.*;
import java.io.*;
 
public class PrototypeServer {
    public static void main(String[] args) throws IOException {
         
        if (args.length != 1) {
            System.err.println("Usage: java PrototypeServer <port number>");
            System.exit(1);
        }
 
        int portNumber = Integer.parseInt(args[0]);
        ServerSocket server = null;
 
        try{
            server = new ServerSocket(portNumber);
        } catch (IOException e) {
            System.out.println("Could not listen on port " + portNumber);
            System.exit(-1);
        }
            
        while(true){
            ClientWorker w;
            try{
        //server.accept returns a client connection
              w = new ClientWorker(server.accept());
              Thread t = new Thread(w);
              t.start();
            } catch (IOException e) {
              System.out.println("Accept failed: " + portNumber);
              System.exit(-1);
            }
        }
    }
}
