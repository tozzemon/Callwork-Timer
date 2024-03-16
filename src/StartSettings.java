import java.util.Scanner;

class StartSettings {

    public static Double[] settings(Scanner Scan, Double LimitHours, Double StartFromHours) {

        boolean LimitAccepted = true, StartValueAccepted = false;

        while (LimitAccepted) {

            while (LimitAccepted) {

                try {

                    System.out.print("Enter a limit in hours: ");
                    LimitHours = Scan.nextDouble(); Scan.nextLine();

                    if (LimitHours <= 0)  {

                        System.out.println("The limit can't be zero or less...");

                    }

                    else if (LimitHours > 24) {

                        System.out.println("Whole " + LimitHours.intValue() + " hours of work? Calm down a little bit :)");

                    }

                    else if (LimitHours >= 10) {

                        System.out.println("Really bravely... Ok.");
                        StartValueAccepted = true;
                        LimitAccepted = false;

                    }

                    else {

                        StartValueAccepted = true;
                        LimitAccepted = false;

                    }

                } catch (Exception e) {

                    System.out.println("Only numbers with commas are acceptable..."); Scan.nextLine();

                }

            }

            while (StartValueAccepted) {

                try {

                    System.out.print("Enter a number you want to start from in hours: "); StartFromHours = Scan.nextDouble();

                    if (StartFromHours >= LimitHours) {

                        System.out.print("Entered number equals or bigger than the limit...\n");

                    } else {

                        StartValueAccepted = false;

                    }

                } catch (Exception e) {

                    System.out.println("Only numbers with commas are acceptable..."); Scan.nextLine();

                }

            }

        }

        Scan.nextLine();

        return new Double[]{LimitHours, StartFromHours};

    }

}