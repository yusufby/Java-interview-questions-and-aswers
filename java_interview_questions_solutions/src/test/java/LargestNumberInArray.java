import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberInArray {
    public static void main(String[] args) {
        Integer[] numbers = {23, 43, 54, 67, 73, 12};
        //use Arrays.sort() method
        Arrays.sort(numbers);
        System.out.println(" the biggest number in Array " + numbers[numbers.length - 1]);
        System.out.println(Arrays.toString(numbers));
        System.out.println(" the smallest number in Array " + numbers[0]);

        //Largest Number in Array using Collections
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(65);
        numbers2.add(0);
        numbers2.add(651);
        numbers2.add(35);
        numbers2.add(59);
        System.out.println(numbers2);
        Collections.sort(numbers2);
        System.out.println(numbers2.get(numbers2.size() - 1));

        //Largest Number in Array using Collections with loop
        List<Integer> numbers3=new ArrayList<>(numbers2);
        numbers3.add(900);
        numbers3.add(90);
        numbers3.add(307);
        System.out.println(numbers3);
        int biggestNum=0;
//        for (int i = 0; i < numbers3.size()-1; i++) {
//            if (biggestNum>)
        }


    }

