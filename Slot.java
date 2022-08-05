/* 
*   TItle/Problem:Module 6 warmup
*   Program Description: Class that creates a die object
*   Author: Matthew Rowntree
*   Date: 06/26/18
*   Filename:   Slot.java
*/


//import statements
import java.util.*; 

// class beginning
class  Slot {
   
         private static final int MAX_NUM = 5;
         private static final int MIN_NUM = 1;
         private static final int noNum = 0;
         private int number;
         private Random random;
         
         public Slot () {
            
            random = new Random();
            number = noNum;
         }
         
         public void roll() {
            
            number = random.nextInt(MAX_NUM - MIN_NUM + 1)+ MIN_NUM;
         }
         
         public int getNumber() {
            
            return number;
         }     

}