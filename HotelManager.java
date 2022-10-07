/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelmanager;
import static java.lang.System.in;
import java.util.Scanner;
import java.util.*;
import java.io.*;
/**
 *
 * @author tdolan21
 */
public class HotelManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int PetsResult; 
        int OceanviewResult; 
        int RoomTypeResult;
        int subtotal;
        int Reservation = 0; 
        
        int total;
        int Reservation2=0;
        String yn, response;
       
        
        
//        Introductory Dialogue
        
        System.out.println("Would you like to add a room to your reservation? (y/n) \n");
        
        Scanner myScanner = new Scanner(System.in);
        yn = myScanner.next();
        System.out.println("\n");

     
        for (int RoomCounter = 0; RoomCounter <3; ++RoomCounter) {
            System.out.println("Please select a room \n");
            
            RoomTypeResult = RoomType(Reservation);
            
            OceanviewResult = OceanView(Reservation);
            
            PetsResult = pets(Reservation);
            
            subtotal = PetsResult+OceanviewResult+RoomTypeResult;
            
            Reservation2 += subtotal;
           
            
               if (RoomCounter == 0){
                    System.out.println("----------------------------------------------------------");
             System.out.println("This is your subtotal for one room: " + Reservation2);
              System.out.println("----------------------------------------------------------");
               }
               if (RoomCounter == 1) {
                    System.out.println("----------------------------------------------------------");
                   System.out.println("This is your subtotal for two room:" +Reservation2);
                    System.out.println("----------------------------------------------------------");
               }
               
               if (RoomCounter == 2) {
                   System.out.println("----------------------------------------------------------");
                   System.out.println("This is your subtotal for three room:" + Reservation2);
                   System.out.println("Estimated tax to be collected: " + Reservation2*5/100);
                   System.out.println("Grand total for three rooms: " + (Reservation2 + Reservation2*5/100));
                   
                   System.out.println("Thank you for your patronage");
                   
                   System.out.println("----------------------------------------------------------");
                   
                   
               }
            
            
        }
        
      
    }
    
//    Method for pets
    public static int pets(int a) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many pets do you have? ($50 charge per pet)");
        a = myScanner.nextInt();
        return a*50;
    }
  
//    Method for Room Type
    public static int RoomType(int b) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("1 = Suite: $275");
        System.out.println("2 = King: $150");
        System.out.println("3 = Queen: $150");
        System.out.println("4 = Two Doubles: $125 \n");
        b = myScanner.nextInt();
        
        
        switch (b){
            case 1:
                System.out.println("You have selected a Suite. The charge will be $275");
                return b+275;
            case 2:
                System.out.println("You have selected a King. The charge will be $150");
                return b+150;
            case 3: 
                System.out.println("You have selected a Queen. The charge will be $150");
                return b+150;
            case 4:
                System.out.println("You have selected Two Doubles. The charge will be $125");
                return b+125;
            default:
                System.out.println("Please select a room");
                RoomType(b);
        }
        return b;
    }
    
//  Method for Ocean View  
    public static int OceanView(int c) {
        String d;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Would you like a room with a view of the ocean?");
        d = myScanner.next();
        YesNo(d);
        
       switch (d) {
           case "y":
               System.out.println("Thank you, an ocean view will be $45 surcharge");
               return c+45;
           case "n":
               System.out.println("Please Continue");
               return c;
       }
        return c;
    }
   
//    Method to ask the user yes or no
    public static String YesNo(String a) {
        Scanner myScanner = new Scanner(System.in);
        String answer;
        
        
        System.out.println("Please answer y/n");
        answer = myScanner.next();
        switch (answer){
            case "y":
                return a;
               
            case "n":
                return a;
                
            default:
                System.out.println("Please answer y/n");
            
        }
        
        
       return a;
    }
    
    
}
