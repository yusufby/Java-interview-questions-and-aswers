public class ArmstrongNumber {
    public static void main(String[] args) {
        //An Armstrong number of three digits is an integer such that the sum of the
        // cubes of its digits is equal to the number itself.
        // For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
        int sum = 0;
        int digit;
        int temp;
        int number = 371;
        temp = number;
        while(temp >0){
            digit = temp %10;
            sum = sum + (digit*digit*digit);
            temp = temp /10;
        }
        if(number==sum)
            System.out.println(number + " is an armstrong number");
    }
}
