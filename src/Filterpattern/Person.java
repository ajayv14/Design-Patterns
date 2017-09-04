public class Person{
	

private String name;
private String gender;
private String status;

public Person (String name,String gender, String status){
  this.name = name;
  this.status = status;
  this.gender = gender;
}


public String getName(){
	return name;
}

public String getStatus(){
	return status;
}

public String getGender(){
	return gender;
}
}