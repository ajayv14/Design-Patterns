public class Demo{

 public static void main(String[] args){

 Employee CEO = new Employee("Elon","CEO",200000);
 Employee CFO = new Employee("Nolan","CFO",150000);
 Employee CTO = new Employee("Steve","CTO",175000);

 CEO.addEmployee(CFO);
 CEO.addEmployee(CTO);

 Employee SoftwareDeveloper1 = new Employee("Ajay","SDE1",100000);
 Employee SoftwareDeveloper2 = new Employee("Srinivasan","SDE1",100000);

 CTO.addEmployee(SoftwareDeveloper1);
 CTO.addEmployee(SoftwareDeveloper2);


 //print all employeed
 System.out.println(CEO);

 for(Employee mainEmp : CEO.getSubOrdinates()){
 	System.out.println(mainEmp);
 }
 
 for (Employee emp : CTO.getSubOrdinates()){
    System.out.println(emp);
 }


 }	


}