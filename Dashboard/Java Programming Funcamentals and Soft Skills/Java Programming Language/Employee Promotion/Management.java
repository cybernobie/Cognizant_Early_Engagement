import java.util.*;
public class Management{
 private double salaryLimit;
 private List<Employee> employeeList=new ArrayList<Employee>();
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
  int c=0;
  for(int i=0;i<employeeList.size();i++)
  {
   Employee ob=employeeList.get(i);
   if(ob.getEmpSalary()>=salaryLimit)
   {
    c++;
   }
  }
  setCount(c);
     //Fill the code
 }
}