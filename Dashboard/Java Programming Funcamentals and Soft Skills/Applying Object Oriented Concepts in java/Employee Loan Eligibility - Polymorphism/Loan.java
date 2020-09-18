public class Loan {
    public double calculateLoanAmount(Employee employee) {
        double loan = 0.0;

        if (employee instanceof PermanentEmployee) {
            loan = employee.getSalary() * 15.0 / 100.0;
        } else if (employee instanceof TemporaryEmployee) {
            loan = employee.getSalary() * 10.0 / 100.0;
        }

        return loan;
    }
}
