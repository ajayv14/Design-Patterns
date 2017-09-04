import java.util.List;
import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args){

	  //create a list of people
	  List<Person> people = new ArrayList<Person>();
	  people.add(new Person("Ajay","Male","Single"));
	  people.add(new Person("Ian","Male","Married"));
	  people.add(new Person("Amy","Female","Single"));
      
      CriteriaMale allMales = new CriteriaMale();

      System.out.println("All Males");
      printResult(allMales.meetCriteria(people));      

	}


	public static void printResult(List<Person> filteredPeople){

     for(Person person : filteredPeople){
        System.out.println(person.getname());      
     }

	}

}