/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numberguessgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jokhi
 */
public class GuessNumGame {
    
  static  Scanner s=new Scanner(System.in);    
   static  int input;   
   static String ask;
    
    public static void checkGuess(int num){
        System.out.println("You have 5 attempts to guess a number");
       int att=5;
       do{ 
            System.out.println("enter a number between 1 to 50");
            input=s.nextInt();
            
            if(input>num){
            System.out.println("your number is greater than the actual number ");
                
        
            }
        
        else  if(input<num){
            System.out.println("your number is less than the actual number");
          
            
        }
        
        else  {
            System.out.println(" Congratulations you guess it number is "+ num);
               break;
        }
            att--;
            
            if (att == 0) {
                System.out.println("You've used all attempts. The actual number was " + num);
                break;
            }

            System.out.println("enter c to continue enter Q to quit ");   
            ask=s.next();
      
       
       }
       
       while(ask.equalsIgnoreCase("c") && att>0);
            
          
    }    
    
    public static void main (String[] arg){
        String playagain;
        int num;
        
        Random r=new Random();
       
        System.out.println("    WELCOME TO THE NUMBER GUESSING GAMES   ");
      do{
           num=r.nextInt(50)+1;
        checkGuess(num);
        System.out.println("Do you want to play again? If yes, enter 'y'. If no, enter 'n':");
        playagain=s.next();
      } 
        while(playagain.equalsIgnoreCase("y"));
        
        }
    }
    
    

