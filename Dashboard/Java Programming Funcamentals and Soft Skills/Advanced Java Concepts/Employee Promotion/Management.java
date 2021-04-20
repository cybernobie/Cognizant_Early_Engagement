import java.util.*;
import java.util.stream.Stream;
public class Management extends Thread {
	private double salaryLimit;
	private List<Employee> employeeList;
	private int count;
	public Management(double salaryLimit, List<Employee> employeeList) {
		super();
		this.salaryLimit = salaryLimit;
		this.employeeList = employeeList;
	}
	public double getSalaryLimit() {
		return salaryLimit;
	}
	public void setSalaryLimit(double salaryLimit) {
		this.salaryLimit = salaryLimit;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void run()
	{
		Stream<Employee> ss=employeeList.stream();
	    int n=(int)ss.filter(o -> ((Employee) o).getEmpSalary()>= this.salaryLimit).count();
	    setCount(n);
	}
}
