public class Employee {
 private String empName;
 private String empId;
 private double empSalary;
 
 public Employee(String empName, String empId, double empSalary) {
  super();
  this.empName = empName;
  this.empId = empId;
  this.empSalary = empSalary;
 }
 public String getEmpName() {
  return empName;
 }
 public void setEmpName(String empName) {
  this.empName = empName;
 }
 public String getEmpId() {
  return empId;
 }
 public void setEmpId(String empId) {
  this.empId = empId;
 }
 public double getEmpSalary() {
  return empSalary;
 }
 public void setEmpSalary(double empSalary) {
  this.empSalary = empSalary;
 }
 
}