import java.util.Scanner;

class Confirmation {
    public static void enter(Scanner s, Double HLimit, Double HStart) {

        System.out.println("\nLimit: " + HLimit + " hour(-s)" + " | Start: " + HStart + " hour(-s)\n");
        System.out.print("Press Enter to start the timer ");
        s.nextLine();
        System.out.print("\n");

    }
}