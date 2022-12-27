import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        //Reverse String – For Loop
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a name");
        String stringName=scan.next();
        String reversedName="";
        for (int i =stringName.length()-1 ; i >=0 ; i--) {
            reversedName=reversedName+stringName.charAt(i);
        }
        System.out.println(reversedName);

        //BEST WAY:
        String name="Yusuf Bayram".toLowerCase();
        String reverseName=new StringBuilder(name).reverse().toString();
        System.out.println(reverseName);

        }
    }

