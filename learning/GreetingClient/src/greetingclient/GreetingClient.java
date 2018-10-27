/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingclient;

import java.net.*;
import java.io.*;
/**
 *
 * @author nazmulbasher
 */
public class GreetingClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            
            DataInputStream in = new DataInputStream(client.getInputStream());
            System.out.println("Server says " + in.readUTF());
            
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
