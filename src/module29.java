// custom exception class
class AryanException extends Exception{
    public AryanException(String str){
        super(str);
    }
}

public class module29 {
    public static void main(String[] args) {
        // marker interface
        // it is an interface with zero methods(in detail later)

        // Errors

        // 1. Compile Time Error: Error during compilation
        // 2. Run Time Error(Exceptions): Error during the execution of application(eg. dividing by 0)
        // 3. Logical Error: Human's skill issue in making logic :/ (hardest to solve)

        // Try and Catch method of handling exceptions
        try
        {
            int i = 0;
            int j = 18/i;
            System.out.println(j);
        } // multiple catches with one try
        catch(ArithmeticException arit){
            System.out.println("Something went arithmetically wrong=> "+arit);
        }
        catch (Exception err){
            System.out.println("idk what went wrong");
        }

        // exception hierarchy(ies):
        /*
        Top: Object -> Throwable -> Exception -> {Runtime Exceptions->(Many Diff Exceptions..)} or SQL Exceptions or IO Exception
        Top: Object -> Throwable -> Error -> ThreadDeath or Io Error or {Virtual Machine Error(->out of memory)}
         */

        System.out.println("------------");
        // throw keyword
        try{
            int i = 0;
            if(i==0){
                throw new ArithmeticException("I dont want value to be 0"); // throwing an error
                // we customized the exception
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("------------");
        // custom exception
        try{
            int i = 0;
            if(i==0){
                throw new AryanException("Aryan Disapproves");
            }
        }
        catch(AryanException e){
            System.out.println(e);
        }

    }
}
