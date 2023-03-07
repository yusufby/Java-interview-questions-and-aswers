public class sumDouble {

    public static void main(String[] args) {
        //sumDouble
        /*

Given two int values, return their sum.
Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8*/
        System.out.println(someDouble(5, 6));
        System.out.println(someDouble(9, 6));
        System.out.println(someDouble(5, 3));
        System.out.println(someDouble(3, 3));
    }
    public static int someDouble(int num1, int num2 ){

       if (num1==num2){
           return num1*4;
       }
        return (num1+num2);
    }
}
