import java.util.Scanner;
//DO NOT EDIT OR DELETE
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeUtility utilObj=new EmployeeUtility();
		System.out.println("Enter the number of Employees");
		int n=sc.nextInt();
		sc.nextLine();
		if(n>0) {
			System.out.println("Enter the details of Employees");
			String [] details=new String[n];
			for(int i=0;i<n;i++) {
				details[i]=sc.nextLine();
			}
			System.out.println("Enter the minimum eligible salary");
			double minSalary=sc.nextDouble();

			String[] result=utilObj.shortlistedEmployee(utilObj.getStreamOfEmployee(utilObj.getEmployeeDetails(details)),minSalary);
			if(result.length>0)	{
				System.out.println("Shortlisted Employees are");
				for(String s:result) {
					System.out.println(s);
				}
			}
			else {
				System.out.println("No Employee is having the required salary");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
