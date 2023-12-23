enum Status{
    Running, Failed, Pending, Success;
}

enum Laptp{
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
    private Laptp(int price){
        this.price = price;
    }
    private int price; // instance variable

    public int getPrice() {
        return price;
    }
}
public class module26 {
    public static void main(String[] args) {

        // enums in java
        Status isRunning = Status.Running;
        Status isDownloading = Status.Pending;
        System.out.println(isRunning);
        System.out.println(isRunning.ordinal()); // every status has a number assigned to it(like index)
        // this is kind of our custom cute data type :3


        Status[] allStatus = Status.values();
        for (Status s: allStatus) {
            System.out.println(s);
        }

        // switch case with enums

        switch (isRunning) {
            case Running -> System.out.println("All good");
            case Pending -> System.out.println("Please Wait");
            default -> System.out.println("meh");
        }

        // enum class in Java
        // every enum in java extends enum class
        Laptp lap = Laptp.Macbook;
        System.out.println(lap.getPrice());

    }
}
