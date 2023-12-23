import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class module34 {
    public static void main(String[] args) {
        // collection is an interface

        // ArrayList implementation of Collection
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(8);
        nums.add(2);
        System.out.println(nums); // like python :3
        // iterating with for each loop
        for(int i: nums){
            System.out.println(i);
        }

        System.out.println("-----");

        // List as a better interface?
        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(54);
        nums2.add(5);
        nums2.add(4);
        nums2.add(14);
        // accessing via index
        System.out.println(nums2.get(2));
    }

}
