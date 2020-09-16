import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Course {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Enter no of course:");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Range");
        } else {
            Set<String> courses = new HashSet<>();

            System.out.println("Enter course names:");

            for (int i = 0; i < n; ++i) {
                String course = scanner.next();
                courses.add(course);
            }

            System.out.println("Enter the course to be searched:");
            String courseToBeSearched = scanner.next();

            if (courses.contains(courseToBeSearched)) {
                System.out.println(courseToBeSearched + " course is available");
            } else {
                System.out.println(courseToBeSearched + " course is not available");
            }
        }
    }
}
