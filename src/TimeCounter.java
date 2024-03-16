import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

class TimeCounter {

    public static boolean Counter(DecimalFormat decimalFormat, DecimalFormat Percentage, Double LimitHours, Double StartFromHours, Double HourInSeconds, Double MinuteInSeconds) {

        Double LimitSeconds = LimitHours * HourInSeconds, StartFromSeconds = StartFromHours * HourInSeconds;

        while (StartFromSeconds < LimitSeconds) {

            String Counter = decimalFormat.format(StartFromSeconds / HourInSeconds);
            Integer MinutesTillTheEnd = (int) ((LimitSeconds - StartFromSeconds) / MinuteInSeconds);
            String PercentageBehind = Percentage.format((StartFromSeconds / LimitSeconds) * 100);

            System.out.println("[ CURRENT TIME: " + Counter + " | TILL THE END " + MinutesTillTheEnd + " minute(-s) | " + PercentageBehind + "% BEHIND | TARGET: " + LimitHours + " ]");

            try {

                TimeUnit.SECONDS.sleep(1);

            } catch (Exception e) {

                System.out.print(e);

            }

            StartFromSeconds++;

        }

        System.out.println("\nTHE LIMIT HAS BEEN REACHED!\n");

        return true;

    }

}