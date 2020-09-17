import java.util.Scanner;

public class Main {
    public static Employee getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        double salary;

        System.out.println("Enter Id:");
        id = scanner.nextInt();

        System.out.println("Enter Name:");
        name = scanner.next();

        System.out.println("Enter salary:");
        salary = scanner.nextDouble();

        Employee employee = new Employee();
        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        employee.setSalary(salary);

        return employee;
    }

    public static int getPFPercentage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Employee employee = getEmployeeDetails();
        int pfp = getPFPercentage();
        employee.calculateNetSalary(pfp);

        System.out.println("Id : " + employee.getEmployeeId());
        System.out.println("Name : " + employee.getEmployeeName());
        System.out.println("Salary : " + employee.getSalary());
        System.out.println("net Salary : " + employee.getNetSalary());
    }
}