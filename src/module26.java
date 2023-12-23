enum Status{
    Running, Failed, Pending, Success;
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

    }
}
