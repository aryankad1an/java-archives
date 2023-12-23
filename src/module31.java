import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class module31 {
    public static void main(String[] args) throws IOException {
        // getting user input(Finally lol)

//        // method 1(legacy)
//        System.out.println("Enter a number: ");
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//
//        int num = Integer.parseInt(bf.readLine()); // typecasting string to num
//        System.out.println(num);
//
//        bf.close();

        // method 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String inp = sc.nextLine();
        System.out.println(inp);
    }
}
