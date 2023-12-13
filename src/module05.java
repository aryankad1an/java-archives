class Computer{
    public void playMusic(){
        System.out.println("Music is being player nig");
    }

    public String giveMeAPen(int cost){
        if(cost > 0){
            return "pen";
        }
        else {
            return "pencil";
        }
    }

}

public class module05 {
    public static void main(String[] args){
        // a function inside class are called methods :) [they are meaningful]

        Computer mycomputer = new Computer();
        mycomputer.playMusic();
        String _result = mycomputer.giveMeAPen(10);
        String _result_2 = mycomputer.giveMeAPen(0);
        System.out.println(_result+" "+_result_2);
    }
}
