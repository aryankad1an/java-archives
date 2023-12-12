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

        
    }
}
