import java.util.*;

@SuppressWarnings("unchecked")//Do not delete this line
public class CountOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String article = scanner.nextLine().toLowerCase();
        Map<String, Integer> map = new TreeMap<>();

        String[] strings1 = article.split(" ");

        for (String str1 : strings1) {
            String[] strings2 = str1.split(",");

            for (String str2 : strings2) {
                String[] strings3 = str2.split(";");

                for (String str3 : strings3) {
                    String[] strings4 = str3.split(":");

                    for (String str4 : strings4) {
                        String[] strings5 = str4.split("\\.");

                        for (String str5 : strings5) {
                            String[] strings6 = str5.split("\\?");

                            for (String str6 : strings6) {
                                String[] strings7 = str6.split("!");

                                for (String str7 : strings7) {
                                    if (!str7.isEmpty()) {
                                        map.put(str7, map.getOrDefault(str7, 0) + 1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        int count = 0;
        for (int i : map.values()) {
            count += i;
        }

        System.out.println("Number of words " + count);
        System.out.println("Words with the count");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}