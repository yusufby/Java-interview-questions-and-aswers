public class Palindrome {
    //Palindrome :a word, phrase, or sequence that reads the same backwards as forwards
    public static void main(String[] args) {

        System.out.println(palindrome("yusuf"));
        System.out.println(palindrome("yusuy"));
        System.out.println(palindrome("fatma"));

    }

    public static boolean palindrome(String str){
        if (str==null){
            return false;
        }
        StringBuilder strReversed=new StringBuilder(str);
        return strReversed.reverse().toString().equals(str);

    }
}
