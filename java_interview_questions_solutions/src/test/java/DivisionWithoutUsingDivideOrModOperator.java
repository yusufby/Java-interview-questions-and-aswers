public class DivisionWithoutUsingDivideOrModOperator {
    public static void main(String args[]) {

        System.out.println(division(44, 4));
        System.out.println(division(54, 10));
    }
    public static String division(int divident, int divisor){
        int quotient=0;
        int remainder=0;
        while (divident>=divisor){
            divident=divident-divisor;
            quotient++;
            remainder=divident;
        }
        return " quotient= " + quotient + " remainder= " + remainder;
    }
    }


