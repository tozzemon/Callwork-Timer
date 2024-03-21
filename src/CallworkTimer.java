import java.text.DecimalFormat;
import java.util.Scanner;

public class CallworkTimer {
    public static void main(String[] args) {

        while (true) {
            final Double SHour = 3600.0, SMinute = 60.0;
            Double HLimitInput = 0.0, HStartInput = 0.0;
            Scanner s = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.####"), percent = new DecimalFormat("#.#");

            final Double HLimit = Settings.limit(s, HLimitInput);
            Double HStart = Settings.start(s, HStartInput, HLimit);

            Confirmation.enter(s, HLimit, HStart);

            TimeCounter.counter(s, df, percent, HLimit, HStart, SHour, SMinute);
        }

    }
}
