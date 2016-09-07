
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author garn3_000
 */

class ClientWorker implements Runnable {
  private Socket client;

//Constructor
  ClientWorker(Socket client) {
    this.client = client;
  }

  public void run(){
    BufferedReader in = null;
    PrintWriter out = null;
    try{
      in = new BufferedReader(new InputStreamReader(client.getInputStream()));
      out = new PrintWriter(client.getOutputStream(), true);
    } catch (IOException e) {
      System.out.println("in or out failed");
      System.exit(-1);
    }

    while(true){
      try{
        System.out.println("Connection successful for IP: " + client.getInetAddress().toString().substring(1));
        System.out.println("Waiting on " + this.client.getInetAddress().toString().substring(1) + " response...");

        String inputLine, outputLine;

        ServerProtocol sp = new ServerProtocol();

        while ((inputLine = in.readLine()) != null) {
            System.out.println(this.client.getInetAddress().toString().substring(1) + ": " + inputLine);
            outputLine = sp.sendResponse(inputLine);
            out.println(outputLine);
            System.out.println("Server: " + outputLine);
            System.out.println("Waiting on " + this.client.getInetAddress().toString().substring(1) + " response...");
        }
       }catch (IOException e) {
        System.out.println("Read failed");
        System.exit(-1);
       }
    }
  }
}
