// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;
import java.util.*;

public class Main {
	
		private static Map <String,Double> employeeMap=new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		employeeMap.put(employeeName,salary);
	}
	
   
	
	
	public static EmployeeAudit findEmployee()
	{
	    ArrayList<String> name=new ArrayList<>();
	     return  (sal)->{
             
        employeeMap.forEach((key,value)->{
            if(value<=sal) 
            name.add(key);
            
    });
        
        return name;
    };
          
// 		return ref;
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		Scanner kb=new Scanner(System.in);
		boolean value=true;
        Main obj=new Main();
        obj.setEmployeeMap(new HashMap<String,Double>());
		do{
            System.out.println("1. Add Employee details \n 2. Find Employee details \n 3. Exit");
            System.out.println("Enter the choice ");
            int n=kb.nextInt();
            switch(n){
                case 1:
                    
                    System.out.println("Enter the Employee  name ");
                    String fname=kb.next();
                    System.out.println("Enter the Employee Salary ");
                    Double salary=kb.nextDouble();
                    obj.addEmployeeDetails(fname,salary);
                    break;
                case 2:
                     System.out.println("Enter the salary to be searched");
                        double sal=kb.nextDouble();
                        ArrayList<String> str=findEmployee().fetchEmployeeDetails(sal);
                        if(str.size()==0){
                            System.out.println("No Employee Found");
                        }
                        else{
                        for(String s:str)
                        System.out.println(s);
                        }
                        break;
                case 3:
                    
                    value=false;
                    break;
            }
        }while(value!=false);
        System.out.println("Let's complete the session");
	}

}