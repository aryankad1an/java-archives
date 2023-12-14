public class module08 {
    public static void main(String[] args){
        // arrays in Java

        int[] _nums = {3, 4, 5, 6};  // <-- java style array declaration
        _nums[0] = 4;
        System.out.println(_nums[0]);

        // a good for lop for iteratables
        for (int i: _nums){
            System.out.println(i);
        }

        int[] _nums_2 = new int[4]; // all the 4 values are zero
        System.out.println(_nums_2[0]);

        // multi dimentional arrays
        int[][] _multi = new int[3][4];
        // operations similar to C++



    }
}
