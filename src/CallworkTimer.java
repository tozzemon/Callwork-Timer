import java.util.Scanner;
import java.text.DecimalFormat;

public class CallworkTimer {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.####"), Percentage = new DecimalFormat("#.#");
        Double LimitHours = 0.0, StartFromHours = 0.0;
        final Double HourInSeconds = 3600.0, MinuteInSeconds = 60.0;

        while (true) {

            Double[] Settings = StartSettings.settings(Scan, LimitHours, StartFromHours);
            LimitHours = Settings[0]; StartFromHours = Settings[1];

            Confirmation.EnterPressed(Scan, LimitHours, StartFromHours);

            TimeCounter.Counter(decimalFormat, Percentage, LimitHours, StartFromHours, HourInSeconds, MinuteInSeconds);

        }

    }

}