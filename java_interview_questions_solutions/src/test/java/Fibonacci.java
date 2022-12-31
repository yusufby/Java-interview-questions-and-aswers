public class Fibonacci {
    public static void main(String[] args) {
        /*The Fibonacci Sequence is given as: Fibonacci Sequence = 0, 1, 1, 2, 3, 5, 8, 13, 21, …. “3”
         is obtained by adding the third and fourth term (1+2) and so on.
        For example, the next term after 21 can be found by adding 13 and 21.*/
     int a=0;
     int b=1;
        System.out.println(a + " " +b + " ");
        for (int i = 0; i < 13; i++) {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c + " ");
        }
    }
}
