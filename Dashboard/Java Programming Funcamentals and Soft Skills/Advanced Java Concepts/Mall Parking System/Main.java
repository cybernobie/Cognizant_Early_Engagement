import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter
                dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String nowTimeStr = "29/10/2019 20:10";

        System.out.println("In-time");
        String inTimeStr = scanner.nextLine();
        LocalDateTime inTime = null;

        try {
            inTime = LocalDateTime.parse(inTimeStr, dateTimeFormatter);
        } catch (Exception ignore) {
            System.out.println(inTimeStr + " is an Invalid In-Time");
            System.exit(1);
        }

        LocalDateTime now = LocalDateTime.parse(nowTimeStr, dateTimeFormatter);

        if (inTime.compareTo(now) >= 0) {
            System.out.println(inTimeStr + " is an Invalid In-Time");
            System.exit(1);
        }

        System.out.println("Out-time");
        String outTimeStr = scanner.nextLine();
        LocalDateTime outTime = null;

        try {
            outTime = LocalDateTime.parse(outTimeStr, dateTimeFormatter);
        } catch (Exception ignore) {
            System.out.println(outTimeStr + " is an Invalid Out-Time");
            System.exit(1);
        }

        if (inTime.compareTo(outTime) >= 0) {
            System.out.println(outTimeStr + " is an Invalid Out-Time");
            System.exit(1);
        }

        long hours = inTime.until(outTime, ChronoUnit.HOURS);
        long fee = hours * 10 + 10L;
        System.out.println(fee + " Rupees");
    }
}
