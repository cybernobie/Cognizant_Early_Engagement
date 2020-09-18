import java.util.Scanner;

public class Main {
    public static Candidate getCandidateDetails() throws InvalidSalaryException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the candidate Details");

        System.out.println("Name");
        String name = scanner.next();

        System.out.println("Gender");
        String gender = scanner.next();

        System.out.println("Expected Salary");
        double salary = scanner.nextDouble();

        if (salary < 10000) {
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        } else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setExpectedSalary(salary);

            return candidate;
        }
    }

    public static void main(String[] args) {
        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful");
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
