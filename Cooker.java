//+++++Maded by ItzAlanHD
//©©®®™™
//

package me.blin;

import java.util.Scanner;


public class Cooker {

  public static void main(String[] args) {
   
   int eggsAmmount;
   int eggsMin = 1;
   int milkAmmount;
   int milkMin = 500;
   int flourAmmount;
   int flourMin = 1000;
   
   System.out.println("Hello, User");
   System.out.println("Blinmaker starting up... ");
   
   //qna
   System.out.println("How many eggs you have? ");
   Scanner userInput;
   userInput = new Scanner(System.in);
   eggsAmmount = userInput.nextInt();
   
   System.out.println("How many milk you have? ");
   Scanner userInput1;
   userInput1 = new Scanner(System.in);
   milkAmmount = userInput1.nextInt();
   
   System.out.println("How many flour you have? ");
   Scanner userInput2;
   userInput2 = new Scanner(System.in);
   flourAmmount = userInput2.nextInt();
   
   //main code here
   
   if (eggsAmmount < eggsMin || milkAmmount < milkMin || flourAmmount 1< flourMin) {
     System.out.println("Ni blin today :(( wait for babushka");
   } 
   
   //find smallest of 3
   int smallest;
   if (eggsAmmount <= milkAmmount && milkAmmount <= flourAmmount ){
     smallest = eggsAmmount;
   }
   else if (milkAmmount <= flourAmmount && milkAmmount <= eggsAmmount) {
     smallest = milkAmmount;
   }
   else {
     smallest = flourAmmount;
   }
   System.out.println(" ");
   System.out.println("You can make " + smallest*4 + " of blins");
   System.out.println(" ");
   System.out.println("BLINMAKER shuthing down.... ");
  }
}
