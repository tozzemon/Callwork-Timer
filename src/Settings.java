import java.util.Scanner;

class Settings {
    public static Double limit(Scanner s, Double HLimitInput) {

        try {
            System.out.print("Enter a limit in hours: ");
            HLimitInput = s.nextDouble();
            s.nextLine();
            if (HLimitInput <= 0) {
                System.out.println("The limit can't be zero or less...");
                return Settings.limit(s, HLimitInput);
            } else if (HLimitInput > 24) {
                System.out.println("Whole " + HLimitInput.intValue() + " hours of work? Calm down a little bit :)");
                return Settings.limit(s, HLimitInput);
            } else if (HLimitInput >= 10) {
                System.out.println("Really bravely... Ok.");
            }
        } catch (Exception e) {
            System.out.println("Only numbers with commas are acceptable...");
            s.nextLine();
            return Settings.limit(s, HLimitInput);
        }
        return HLimitInput;

    }

    public static Double start(Scanner s, Double HStartInput, Double HLimitInput) {

        try {
            System.out.print("Enter a number you want to start from in hours: ");
            HStartInput = s.nextDouble();
            if (HStartInput >= HLimitInput) {
                System.out.print("Entered number equals or bigger than the limit...\n");
                return Settings.start(s, HStartInput, HLimitInput);
            } else if (HStartInput < 0) {
                System.out.print("The start value can't be less than zero...\n");
                return Settings.start(s, HStartInput, HLimitInput);
            }

        } catch (Exception e) {
            System.out.println("Only numbers with commas are acceptable...");
            s.nextLine();
            return Settings.start(s, HStartInput, HLimitInput);
        }
        s.nextLine();
        return HStartInput;

    }
}
