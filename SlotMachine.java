/* 
*   TItle/Problem:Slot machine partner program
*   Program Description: Create a slot machine that returns 3 random numbers between 1 and 5
*   Author: Matthew Rowntree
*   Date: 7/10
*   Filename: SlotMachine.java
*/


//import statements
import java.util.*;     

// class beginning
class  SlotMachine {
   public static void main(String[] args ) { 
      
         //Declare variables area
         int balance;
         int wager;
         Slot slot1 = new Slot();
         Slot slot2= new Slot();
         Slot slot3= new Slot();
         Scanner sc1 = new Scanner(System.in);
         char yesNo;
         boolean go = true;

         //welcome user
         System.out.println("Welcome to the slot machine");
         
         //set initial balance to 100
         balance = 100;
         
         //Ask if they would like to play as long as balance > 0
         while (balance > 0 && go)
         {
            System.out.println("Would you like to play? Enter Y or N: ");
         
            yesNo = sc1.next().charAt(0);
            
            //while response isn't yes or no make user enter again
            while (yesNo != 'Y' && yesNo != 'N' && yesNo != 'y' && yesNo != 'n')
            {
               System.out.println("Invalid entry.  Would you like to play? Enter Y or N: ");
               yesNo = sc1.next().charAt(0);
            }
            
            //if answer is no, say goodbye
            if (yesNo == 'N' || yesNo == 'n')
               {
                  System.out.println("Goodbye.");
                    go = false;
               }
            
            //if answer is yes, run program
            else if(yesNo == 'Y' || yesNo == 'y')
               {
                     System.out.println("Please enter wager: ");
                     wager = sc1.nextInt();
                     
                     //make sure wager is not greater than balance
                     while(wager > balance)
                     {
                        System.out.println("Invalid wager.  Please enter wager: ");
                        wager = sc1.nextInt();
                     }
                     
                     //call roll method to randomize the 3 slot objects
                     slot1.roll();
                     slot2.roll();
                     slot3.roll();
                     
                     //display results of the 3 rolls
                     System.out.println("You rolled: " + slot1.getNumber() + " " + slot2.getNumber() + " " + slot3.getNumber());
                     
                     //if all 3 are equal, win double wager and display total
                     if (slot1.getNumber() == slot2.getNumber() && slot1.getNumber() == slot3.getNumber())
                        {
                           balance = balance + wager*2;
                           System.out.println("You win!  Balance is: " + balance);
                        }
                        
                     //if 1st 2 or last 2 are equal, you win your wager and print balance
                     else if (slot1.getNumber() == slot2.getNumber() || slot2.getNumber() == slot3.getNumber())
                        {
                           balance = balance + wager;
                           System.out.println("You win!  Balance is: " + balance);
                        }
                        
                     //if none are equal, lose wager amount and print balance
                     else
                        {  
                           balance = balance - wager;
                           System.out.println("You lose.  Balance is: " + balance);
                        }
               }
         }
         
         
   }// end main method 

      
}// end class