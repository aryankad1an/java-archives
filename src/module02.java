public class module02 {
    public static void main(String[] a){

        // variables and data types
        int num = 3;
        System.out.println(num);
        System.out.println(num*3);
        System.out.println(num+69);

        // primitive data types: integer types, float types, character and boolean
        // integer types: int(4B) long(8B) short(2B) byte(1B)
        // float types: float(4B) double(8B)
        // char: 2 Bytes
        char c = 'e';
        char d = '\n';
        byte numba = 59;
        System.out.println(numba);

        double cgpa = 6.9;
        // by default point values will be considered as double, so we need to explicitly typecast them to float to assign it to float
        float cg = 6.9f;


        //boolean: true or false(in java it doesn't work in 0/1)
        boolean isNigga = false;



        // literals

        // decimal literal
        int num1_decimal = 100;
        int num_binary = 0b101; // binary: 101; decimal: 5
        int num_hex = 0x7E; // hex: 7E
        System.out.println(num_binary); // prints in decimal
        System.out.println(num_hex); // prints in decimal


        // a java feature to help programmers
        int num_with_lots_of_zeroes = 10_000_000; // runs normally
        System.out.println(num_with_lots_of_zeroes);

        double scientific_number = 12e4; // equivalent to: 12*(10^4)
        System.out.println(scientific_number);


        //something about character literals
        char ch = 'a';
        ch++;
        System.out.println(ch); //outputs b(based on ASCII lol)

    }

}
