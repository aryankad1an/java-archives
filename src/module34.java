import java.sql.Array;
import java.util.*;

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

        System.out.println("-----");

        // Set: Collection with only unique values without any order in mind
        Set<Integer> nums3 = new HashSet<Integer>(); // use TreeSet instead of HashSet to get sorted value
        nums3.add(4);
        nums3.add(8);
        nums3.add(2);
        System.out.println(nums3);

        // maps: key value pairs

        Map<String, Integer> student_marks = new HashMap<String, Integer>();
        student_marks.put("Aryan", 90);
        student_marks.put("Naveen", 56);

        System.out.println(student_marks);
        System.out.println(student_marks.get("Aryan"));

    }

}
