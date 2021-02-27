
package guess.game;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


public class GuessGame {
    public static void 
        guess(){
            Scanner scan = new Scanner(System.in);
            //int number = 10; 
            int number = (int) (1+ (100 * Math.random()));
            //Trials
            int J = 5;
            int i;
            int guess;
           
            for (i=0; i<J; i++){
                 System.out.println("Guess the number" );
                 guess = scan.nextInt();
                 if (number == guess){
                     System.out.println("You have guessed correctly");
                     break;
                 }
                 else if (number > guess && i != J-1){
                     System.out.println("You have guessed incorrectly the number is too low");
            }
            else if (number < guess && i!= J+1){
                    System.out.println("You have guessed incorrectly the number is too high");
                    }
                 }
        System.out.println("The number of loop is " + i + " The number of tries is " + J);
            if(i==J){
                    System.out.println("You have exceded your trials"); 
                    System.out.println("The generated number was " + number); 
                    
        }
            
        }

    
    public static void main(String[] args) {
         guess();
    }
    
}
