public class module03 {
    public static void main(String[] args){
        // -----------------------------------------
        // type conversion and casting
        // -----------------------------------------

        // [we can put a small item in bigger box but not the opposite..]

        // typecasting
        byte b = 127;
        int a = 12;
        b = (byte) a; // implicit conversion

        float f = 5.6f;
        int x = (int) f; // implicit conversion of float to integer
        // x = 5
        System.out.println(x);


        int i = 257;
        byte b1 = (byte) i; //since i is not in range of byte
        // the compiler performs a modulus operation on i
        // it will be: i % (range of byte)
        // i % 256 = 257%256 = 1
        // thus b1 = 1 lmao
        System.out.println(b1);


        // type promotion
        byte ab = 10;
        byte ba = 30;
        int result = ab*ba; // converted to int automatically lol
        System.out.println(result);
    }
}
