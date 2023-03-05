import java.util.Arrays;

public class loopExampleArray {
    public static void main(String[] args){
        //Loop through the items in the cars array.
        String[] cars={"volvo", "opel", "bmw"};
        cars[0]="renault";
        System.out.println(Arrays.toString(cars));
    }
}
