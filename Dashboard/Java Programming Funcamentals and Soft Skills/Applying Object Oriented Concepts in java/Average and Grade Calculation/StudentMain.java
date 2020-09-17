import java.util.Scanner;

public class StudentMain {
    public static Student getStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the id:");
        int id = scanner.nextInt();

        System.out.println("Enter the name:");
        String name = scanner.next();

        int subjects = 0;

        while (true) {
            System.out.println("Enter the no of subjects:");
            subjects = scanner.nextInt();

            if (subjects <= 0) {
                System.out.println("Invalid number of subject");
            } else {
                break;
            }
        }

        int[] marks = new int[subjects];

        for (int i = 0; i < subjects; ++i) {
            int mark = 0;

            while (true) {
                System.out.println("Enter mark for subject " + (i + 1) + ":");
                mark = scanner.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid Mark");
                } else {
                    break;
                }
            }

            marks[i] = mark;
        }

        Student student = new Student(id, name, marks);

        return student;
    }

    public static void main(String[] args) {
        Student student = getStudentDetails();
        student.calculateAvg();
        student.findGrade();

        System.out.println("Id:"  + student.getId());
        System.out.println("Name:" + student.getName());
        System.out.println("Average:" + student.getAverage());
        System.out.println("Grade:" + student.getGrade());
    }
}