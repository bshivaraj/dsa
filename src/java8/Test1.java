package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Integer[] arr = list.toArray(new Integer[0]);

        System.out.println(arr[0]);

       /* List<String> s=Arrays.asList("hello","good","morning");
        List<Integer> i=Arrays.asList(1,2,3,4,5);
        i.stream().reduce(0,Integer::sum);
        i.stream().collect(Collectors.summingInt(Integer::intValue));
        i.stream().mapToInt(Integer::valueOf).sum();*/

    }
}
