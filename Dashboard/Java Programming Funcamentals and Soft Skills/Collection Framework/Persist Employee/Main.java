import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Ritam", 9.5f);
        Employee employee1 = new Employee(102, "Asif", 8.5f);
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(employee, employee1));
        EmployeeUtility employeeUtility = new EmployeeUtility();
        employeeUtility.addEmployee("database.emp", employees);
        Employee employee2 =  employeeUtility.viewEmployeeById("database.emp", 101);
        System.out.println(employee2.getName());
    }
}
