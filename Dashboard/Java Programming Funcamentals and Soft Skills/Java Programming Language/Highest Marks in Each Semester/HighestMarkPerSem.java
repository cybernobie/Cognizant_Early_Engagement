import java.util.*;
import java.util.stream.Collectors;

class Semester {
    private final int subjects;
    List<Integer> marks;

    public Semester(int subjects) {
        this.subjects = subjects;
        marks = new ArrayList<>(subjects);
    }

    public void setMarks(int[] marks) {
        this.marks.addAll(Arrays.stream(marks).boxed().collect(Collectors.toList()));
    }

    public int getSubjects() {
        return subjects;
    }

    public int getMaximumMarks() {
        return Collections.max(marks);
    }
}

class HighestMarkPerSem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sems = 0;

        System.out.println("Enter no of semester:");
        sems = scanner.nextInt();

        if (sems <= 0) {
            System.out.println("Invalid Input");
        } else {
            List<Semester> semesters = new ArrayList<>();

            for (int i = 0; i < sems; ++i) {
                int subjects;

                System.out.println("Enter no of subjects in " + (i + 1) + " semester:");
                subjects = scanner.nextInt();

                if (subjects < 0) {
                    System.out.println("Invalid Input");
                    System.exit(0);
                } else {
                    Semester semester = new Semester(subjects);
                    semesters.add(semester);
                }
            }

            for (int i = 0; i < sems; ++i) {
                Semester semester = semesters.get(i);
                int subjects = semester.getSubjects();
                int[] marks = new int[subjects];

                System.out.println("Marks obtained in semester " + (i + 1) + ":");

                for (int j = 0; j < subjects; ++j) {
                    int mark = scanner.nextInt();

                    if (mark < 0 || mark > 100) {
                        System.out.println("You have entered invalid mark.");
                        System.exit(0);
                    } else {
                        marks[j] = mark;
                    }
                }

                semester.setMarks(marks);
            }

            for (int i = 0; i < semesters.size(); i++) {
                System.out.println("Maximum mark in " + (i + 1) + " semester:" + semesters.get(i).getMaximumMarks());
            }
        }
    }
}
