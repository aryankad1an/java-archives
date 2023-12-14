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
        int[][][] _multi = new int[3][4][5];
        // operations similar to C++


        // jagged array(2D arrays with unequal array's)
        int[][] nums = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[6];
        // here above we can see the unequal length of arrays

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random()*10);
                // randomly values are assigned
            }
        }
        // accessing via for-each loop
        for(int[] i : nums){
            for(int j: i){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
