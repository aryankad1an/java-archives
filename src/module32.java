import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class module32 {
    public static void main(String[] args) {
        // try with finally
        int i = 0;
        int j;
        try{
            j = 18/i;
        }
        catch(Exception e){
            System.out.println("Something went Wrong.");
        }
        finally{ // executed just after the try/catch irrespective of the exception
            System.out.println("Bye!");

            // we should close the resources if any, here.
        }

        // autoclosing resources
        try(
                // code here will be autoclosed
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        )
        {
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
