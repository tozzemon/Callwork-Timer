import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class TimeCounter {
    public static void counter(Scanner s, DecimalFormat df, DecimalFormat percent, Double HLimit, Double HStart, Double SHour, Double SMinute) {

        final Double SLimit = HLimit * SHour;
        boolean reset = false;
        Double SStart = HStart * SHour;

        while (SStart < SLimit + 1) {
            if (SStart >= SLimit) {
                System.out.println("\nTHE LIMIT HAS BEEN REACHED!\n");
                break;
            } else {
                try {
                    if (System.in.available() > 0) {
                        s.nextLine();
                        String confirm = "";
                        while (confirm.isEmpty()) {
                            System.out.print("ON PAUSE (Press Enter again to continue or 'R' to reset the timer) ");
                            confirm = s.nextLine();
                            if (confirm.isEmpty()) {
                                System.out.println("\nCONTINUE\n");
                                break;
                            } else if (confirm.equals("R") || confirm.equals("r")) {
                                System.out.println("\nRESET\n");
                                reset = true;
                            }
                            else {
                                System.out.println();
                                confirm = "";
                            }
                        }
                    } else {
                        String Counter = df.format(SStart / SHour);
                        String Percent = percent.format((SStart / SLimit) * 100);
                        Integer MinutesTillTheEnd = (int) ((SLimit - SStart) / SMinute);
                        System.out.println("[ Current time: " + Counter + "   Till the end: " + MinutesTillTheEnd + " minutes(-s)   " + Percent + "% behind   Target: " + HLimit + " ] Enter — play/pause/reset");
                        TimeUnit.SECONDS.sleep(1);
                        SStart++;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            if (reset) {
                break;
            }
        }

    }
}
