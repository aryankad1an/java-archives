import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class module35 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(54);
        nums.add(57);
        nums.add(41);
        nums.add(14);

        // custom comparison algorithm
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                // based on ascending order of unit's digit
                if(i%10 > j%10){
                    return 1; // this means to swap
                }
                else{
                    return -1; // this means not swap
                }
            }
        };

        // using comparator
        Collections.sort(nums, com);
        System.out.println(nums);

        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(54);
        nums2.add(57);
        nums2.add(41);
        nums2.add(14);

        // lambda with for each
        nums2.forEach(n -> System.out.println(n));

        // Stream API

        // one stream can be used only ONCE
        Stream<Integer> s1 = nums.stream();
        s1.forEach(n -> System.out.println(n));
        //s1.forEach(n -> System.out.println(n)); // <-- gives an error as we have already used this stream once

        Stream<Integer> s2 = nums.stream();

        Stream<Integer> s3 = s2.filter(n -> n%2 == 0); // filtered such that only even numbers there
        s3.forEach(n-> System.out.print(n+" "));
        System.out.println();

        Stream<Integer> s4 = nums.stream();
        Stream<Integer> s5 = s4.map(n -> n*2).sorted(); // doubled every value in stream s4 and sorts it
        s5.forEach(n -> System.out.print(n+" "));
        System.out.println();


        // Reduce method
        // do urself if u see(can refer to javascript)

    }
}
