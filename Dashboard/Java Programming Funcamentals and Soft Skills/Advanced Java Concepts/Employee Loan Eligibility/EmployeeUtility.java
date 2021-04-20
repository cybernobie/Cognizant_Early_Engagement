import java.util.stream.Stream;


public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		int n=details.length;
		Employee[] empobj=new Employee[n];
		int i=0;
		for(String s:details){
			Employee obj=new Employee();
			String[] str=s.split(";");
			obj.setEmpId(str[0]);
			obj.setEmpName(str[1]);
			obj.setSalary(Double.parseDouble(str[2]));
			empobj[i]=obj;
			i+=1;
		}
		return empobj;
	
		



	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {
	    Stream<Employee> emp=Stream.of(empDetails);
		return emp;



	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {
		
		String[] listdata=empStream.sorted((p1, p2)->p1.getEmpId().compareTo(p2.getEmpId())).filter(e->e.getSalary()>=minSalary).map(e->e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary()).toArray(String[]::new);
		
		return listdata;
		





	}

}
