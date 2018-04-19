public class Person{
     
     private final String name;
     private final int age;
     private final int ssn;
     private final int passportNumber;
     private final int salary;
     
     
     
     public static class Builder{
         
         //required params
         private final String name;
         private final int age;
         
         
         //optional params
         private  int ssn=0;
         private  int passportNumber=0;
         private  int salary=0;
         
         public Builder(String name,int age){
             this.name=name;
             this.age=age;
         }
         
         public Builder withSSN(int val){
             ssn=val;
             return this;
         }
         
         public Builder withPassportNumber(int val){
             passportNumber=val;
             return this;
         }
         
         public Builder withSalary(int val){
             salary=val;
             return this;
         }
         
         public Person build(){
             return new Person(this);
         }
     }
     
     private Person(Builder builder){
             name = builder.name;
             salary = builder.salary;
             ssn=builder.ssn;
             age=builder.age;
             passportNumber= builder.passportNumber;
             
         }
      
     public static void main(String []args){
        
        Person h = new Person.Builder("Ajay",27).withSSN(200123445).build();
        System.out.println("My SSN " + h.ssn );
     }
}