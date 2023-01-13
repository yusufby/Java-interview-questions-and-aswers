import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FindTwoMaxNumbers {
    public static void main(String[] args) {

       Integer[] numbers={34,22,56,134,86,90,54};
        Collections.sort(Arrays.asList(numbers));
        System.out.println(numbers[numbers.length-1]);

        System.out.println(numbers[numbers.length-2]);




    }
}
