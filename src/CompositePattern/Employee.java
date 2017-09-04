import java.util.ArrayList;
import java.util.List;

public class Employee{
	
 private String name;
 private String department;
 private int salary;
 private List<Employee> subOrdinates;

 public Employee(String name,String department,int salary){
    this.name =  name;
    this.department = department;
    this.salary = salary;
    subOrdinates = new ArrayList<Employee>();
 }

 public void addEmployee(Employee emp){
    subOrdinates.add(emp);
 }

 public void removeEmployee(Employee emp){
   subOrdinates.remove(emp);
 }

 public List<Employee> getSubOrdinates(){
   return subOrdinates;  
 }

 public String toString(){
   return "name : " + name + " salary : " + salary + " department : " + department;
 }

}