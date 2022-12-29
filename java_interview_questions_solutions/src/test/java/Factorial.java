import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //the product of (= the result of multiplying) a whole number and all the whole numbers below it:
        // EXAMPLE: The factorial of five (5 x 4 x 3 x 2 x 1) is 120
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scan.nextInt();
        int factorialSum=1;

        for (int i = 1; i <=number ; i++) {
            factorialSum=i*factorialSum;
        }
        System.out.println("Factorial "+number +" is " +factorialSum);
    }
}
