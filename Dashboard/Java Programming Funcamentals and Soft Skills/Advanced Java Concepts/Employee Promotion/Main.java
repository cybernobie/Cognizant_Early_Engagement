import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=kb.nextInt();
		List<Employee> ls=new ArrayList<>();
		System.out.println("Enter the employee details");
		for(int i=0;i<n;i++){
		    String str[]=kb.next().split(":");
		    ls.add(new Employee(str[0],str[1],Double.parseDouble(str[2])));
		}
		System.out.println("Enter the number of times salary limit to be searched");
		int noL=kb.nextInt();
		List<Management> Mobj=new ArrayList<>();
		for(int i=0;i<noL;i++){
		    System.out.println("Enter the salary limit to be searched");
		    double d=kb.nextDouble();
		    Management obj=new Management(d,ls);
		    obj.run();
		    Mobj.add(obj);
		}
		for(Management ob:Mobj){
			System.out.println(ob.getSalaryLimit()+" : "+ob.getCount());
		}
}
}
