import java.util.Scanner;

class Season {
    private static boolean isSpring(int month) {
        return month >= 3 && month <= 5;
    }

    private static boolean isSummer(int month) {
        return month >= 6 && month <= 8;
    }

    private static boolean isAutumn(int month) {
        return month >= 9 && month <= 11;
    }

    private static boolean isWinter(int month) {
        return month == 1 || month == 2 || month == 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        String season = "";

        System.out.println("Enter the month:");
        month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        } else {
            if (isSpring(month)) {
                season = "Spring";
            } else if (isAutumn(month)) {
                season = "Autumn";
            } else if (isSummer(month)) {
                season = "Summer";
            } else if (isWinter(month)) {
                season = "Winter";
            }

            System.out.println("Season:" + season);
        }

    }
}
