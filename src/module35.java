import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    }
}
