public class Makes10 {
    public static void main(String[] args){
        System.out.println(numbers(10, 15));

    }
    public static boolean numbers(int a, int b) {
        if (a+b==10){
            return true;
        }
        if (a==10||b==10){
            return true;
        }
        return false;

    }
}
