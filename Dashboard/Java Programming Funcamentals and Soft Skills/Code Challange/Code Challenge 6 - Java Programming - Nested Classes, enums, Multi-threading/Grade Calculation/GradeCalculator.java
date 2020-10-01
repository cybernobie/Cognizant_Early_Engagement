public class GradeCalculator extends Thread {
    private String studName;
    private char result;
    private int[] marks;

    public GradeCalculator(String studName, int[] marks) {
        this.studName = studName;
        this.marks = marks;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public char getResult() {
        return result;
    }

    public void setResult(char result) {
        this.result = result;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public void run() {
        int totalMarks = 0;

        for (int mark : marks) {
            totalMarks += mark;
        }

        if (totalMarks <= 500 && totalMarks >= 400) {
            result = 'A';
        } else if (totalMarks < 400 && totalMarks >= 300) {
            result = 'B';
        } else if (totalMarks < 300 && totalMarks >= 200) {
            result = 'C';
        } else if (totalMarks < 200 && totalMarks >= 0) {
            result = 'E';
        }
    }
}
