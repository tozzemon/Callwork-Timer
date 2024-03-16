import java.util.Scanner;

class Confirmation {

    public static boolean EnterPressed (Scanner Scan, Double LimitHours, Double StartFromHours) {

        System.out.println("\nLimit: " + LimitHours + " hour(-s)" +  "\nStart from: " + StartFromHours + " seconds(-s)\n");

        System.out.println("Press Enter to start the timer");
        Scan.nextLine();

        return true;

    }

}