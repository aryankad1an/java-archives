class Calculator{
    public int add(int num1, int num2){
        return num1 + num2;
    }
}

public class module04 {
    public static void main(String[] args){
        /*
        Conditional Statements, Loops
        */

        // SIMILAR SYNTAX TO C++, no need to redo lol

        /*
        Updated Switch Statement in Java
         */

        String day = "Monday";
        String result = switch (day) {
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";
        };

        /*
        Object Oriented Programming
         */

        Calculator calculator_object = new Calculator(); // a way to create object out of its blueprint(class)
        int res = calculator_object.add(4,5);
        System.out.println(res);
    }
}