import java.util.Scanner;

public class SumOfDigits {
    //find the sum of digits of a number
    //for example: 321=3+2+1=6

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number ");
        int number= scan.nextInt();
        int sumOfDigit=0;

        while (number>0){
            sumOfDigit +=number%10;
            number=number/10;

        }
        System.out.println("sum of digits is " +sumOfDigit);



    }
}
