import java.util.List;
import java.util.ArrayList;

public class CriteriaMale implements Criteria {
	
   
  public List<Person> meetCriteria(List<Person> people){
	
    ArrayList<Person> malePeople = new ArrayList<>();

    for(Person person : people){
       
        if(person.getGender().equalsIgnoreCase("MALE")){
           malePeople.add(person);
        }
    }

    return malePeople;
  }
}