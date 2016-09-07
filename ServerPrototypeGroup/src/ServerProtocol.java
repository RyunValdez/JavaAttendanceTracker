/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author garn3_000
 */
import java.util.Scanner;

class ServerProtocol {
    Scanner keyboard = new Scanner(System.in);
    
    public ServerProtocol(){
        
    }
    
    public String sendResponse(String message){
        String response = null;
        
        System.out.println("Message length: " + message.length());
        System.out.println("Message : <" + message + ">");
        System.out.println("Message first 4 lett: <" + message.substring(0,4)+">");
                
        if(message.length() < 4){
            return response = "Invalid message!";
        }
        
        //Logout Request- User & Admin
        if(message.substring(0,4).equalsIgnoreCase("LOGO")){
            response = "LGOR ";
            System.out.println("Which code would you like to send? (0 or 10)");
            response += keyboard.next();
        }
        
        if(message.length() >= 6){
            //Register Request- User
            if(message.substring(0,6).equalsIgnoreCase("RGST U")){
                response = "RGRP ";
                System.out.println("Which code would you like to send? (0, 10, 20, or 30)");
                response += keyboard.next();
            }
            //Register Request- Admin
            else if(message.substring(0,6).equalsIgnoreCase("RGST A")){
                response = "RGRP ";
                System.out.println("Which code would you like to send? (0, 10, 20, or 30)");
                response += keyboard.next();
            }
            //Login Request- User
            else if(message.substring(0,6).equalsIgnoreCase("LOGN U")){
                response = "LGIR ";
                System.out.println("Which code would you like to send? (0, 10, or 20)");
                response += keyboard.next();
            }
            //Login Request- Admin
            else if(message.substring(0,6).equalsIgnoreCase("LOGN A")){
                response = "LGIR ";
                System.out.println("Which code would you like to send? (0, 10, or 20)");
                response += keyboard.next();
            }
            //Create Class Request- Admin
            else if(message.substring(0,4).equalsIgnoreCase("CREA")){
                response = "CRER ";
                System.out.println("Which code would you like to send? (0 or 10)");
                if(keyboard.next().equals("10"))
                    response += "10";
                else
                    response += "0 \"156655\"";
            }       
            //Class Search Request- User & Admin
            else if(message.substring(0,4).equalsIgnoreCase("CSRC")){
                response = "CSRR ";
                System.out.println("Which code would you like to send? (0 or 10)");
                if(keyboard.next().equals("10"))
                    response += "10";
                else
                    response += "0 \"156655\" \"186668\" \"555888\"";            
            } 
            //Class View Request- User & Admin
            else if(message.substring(0,4).equalsIgnoreCase("CINF")){
                response = "CINR ";
                System.out.println("Which code would you like to send? (0 or 10)");
                if(keyboard.next().equals("10"))
                    response += "10";
                else
                    response += "0 \"156655\" \"CS 350\" \"University of Northern Colorado\" \"Mehrgan Mostowfi\" \"F 01:00-22:59, W08:00-09:15\"";            
            }
            //Enroll Request- User
            else if(message.substring(0,4).equalsIgnoreCase("ENRL")){
                response = "ENRR ";
                System.out.println("Which code would you like to send? (0 or 10)");
                response += keyboard.next();
            } 
            //Drop Request- User
            else if(message.substring(0,4).equalsIgnoreCase("DROP")){
                response = "DRPR ";
                System.out.println("Which code would you like to send? (0 or 10)");
                response += keyboard.next();
            }
            //Delete Class Request- Admin
            else if(message.substring(0,4).equalsIgnoreCase("DELE")){
                response = "DELE ";
                System.out.println("Which code would you like to send? (0, 10, or 20)");
                response += keyboard.next();
            }
            //Attend Request- User
            else if(message.substring(0,4).equalsIgnoreCase("ATTN")){
                response = "ATNR ";
                System.out.println("Which code would you like to send? (0, 10, 20, 30, 40, or 50)");
                response += keyboard.next();
            }
            //Check Attendance Request- User
            else if(message.substring(0,4).equalsIgnoreCase("CCHK")){
                response = "CCHK ";
                System.out.println("Which code would you like to send? (0, 30, or 50)");
                String serverCode = keyboard.next();
                response += serverCode;
                if(serverCode.equals("0"))
                    response += " \"123456\" \"Software Engineering\" \"UNC\" \"Mostowfi\" \"P\" \"10/20/2014 09:15\" \"P\" \"10/25/2014 09:26\"";                
            }
            //User List Request- Admin
            else if(message.substring(0,4).equalsIgnoreCase("ULST")){
                response = "ULSR ";
                System.out.println("Which code would you like to send? (0, 10, or 20)");
                String serverCode = keyboard.next();
                response += serverCode;
                if(serverCode.equals("0"))
                    response += " \"testUser\" \"Test\" \"User\" \"testuser@gmail.com\"";
            }
            //Manual Attend Requst- Admin
            else if(message.substring(0,4).equalsIgnoreCase("ATTM")){
                response = "ATTR ";
                System.out.println("Which code would you like to send? (0, 10, 20, 30, or 40)");
                response += keyboard.next();
            }
            //Check Attendance Request- Admin
            else if(message.substring(0,4).equalsIgnoreCase("CAST")){
                response = "CASR ";
                System.out.println("Which code would you like to send? (0, 10, 20, or 30)");
                String serverCode = keyboard.next();
                response += serverCode;
                if(serverCode.equals("0"))
                    response += " \"user1\" \"User\" \"One\" \"userone@gmail.com\" \"P\" \"09:22\" "
                            + "\"user2\" \"User\" \"Two\" \"usertwo@gmail.com\" \"P\" \"09:14\" "
                            + "\"user3\" \"User\" \"Three\" \"userthree@gmail.com\" \"P\" \"09:45\"";
            }
            //Replace Device Request- User
            else if(message.substring(0,4).equalsIgnoreCase("RDST")){
                response = "RDSR ";
                System.out.println("Which code would you like to send? (0, 10, 20, or 30)");
                response += keyboard.next();
            }
            //Replace Device Permission- Admin
            else if(message.substring(0,4).equalsIgnoreCase("RDPR")){
                response = "RDRR ";
                System.out.println("Which code would you like to send? (0, 10, 20, 30 or 40)");
                response += keyboard.next();
            }
        }
        
        if(response == null)
            response = "Invalid message!";
        
        return response;        
    }    
}
