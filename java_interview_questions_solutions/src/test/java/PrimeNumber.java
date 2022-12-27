public class PrimeNumber {
    public static void main(String[] args) {

        //A prime number is a whole number greater than 1 whose only factors are 1 and itself.
        // A factor is a whole number that can be divided evenly into another number.
        // The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23.....

        System.out.println(checkPrime(10000));
        System.out.println(checkPrime(16));
        System.out.println(checkPrime(225));
        System.out.println(checkPrime(500));
        System.out.println(checkPrime(2));
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            System.out.println(Math.sqrt(2));
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
