package diceGame;

import java.util.*;

public class Game {
  
   public void play() {
   
      // get input from user
      Scanner scnr = new Scanner(System.in);
      System.out.print("How much do you want to bet? ");                                                 
      int enteredBet = scnr.nextInt(); 
      System.out.print("What number do you choose ? ");
      int enteredNum = scnr.nextInt(); 
   
      // generate the die roll 
      Random randGen = new Random();
      int dieNum1  =  randGen.nextInt(6) + 1;
      int dieNum2 = randGen.nextInt(6) + 1;
      System.out.println("The die are " + dieNum1 + " and " + dieNum2);
      
      int totalWinnings;
      
      if (enteredNum == dieNum1 && enteredNum == dieNum2) {
    	  totalWinnings = enteredBet * 50;
    	  System.out.println("You win $" + totalWinnings + "!");
      }
      else 
    	  System.out.println("Sorry you lose");
   
      // write the rest of your code below
        
   }
}