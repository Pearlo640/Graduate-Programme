package number.machine;
import java.util.Scanner;

public class NumberMachine {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println( "Enter your number");
      int num = scan.nextInt();
      int sum = 0;
      int lastnum = 0;
      int rvs = 0;
      while(num!= 0){
        rvs = rvs *10 + num%10;
        lastnum = num%10;
        num = num/10;
        sum = lastnum+sum;
       
    }
      System.out.println( "The number in reverse is " + rvs); 
      System.out.println( "The sum equals " + sum); 
    }
    
}
