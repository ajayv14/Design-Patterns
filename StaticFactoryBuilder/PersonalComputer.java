

public class PersonalComputer{
	
	/*required*/
	private final String processor;
	private final String RAM;
	private final String motherboard;
	private final String powerSuppply;

    /*optional*/ 
	private String GPU; 
	private String liquidCooler;
	 
	/*instantiate with the object from Builder class*/    
    private PersonalComputer(Builder builder){
      this.processor = builder.processor;
      this.RAM = builder.RAM;
      this.motherboard = builder.motherboard;
      this.powerSuppply = builder.powerSuppply;
      this.GPU = builder.GPU;
      this.liquidCooler = builder.liquidCooler;
    }

    /*Getters and setters*/ 
    public String getProcessor(){
    	return processor;
    }

    public String getMotherboard(){
    	return motherboard;
    }
      

    /*static factory class to build PersonalComputer Object*/
    public static class Builder{

        private final String processor;
 	    private final String RAM;
	    private final String motherboard;
     	private final String powerSuppply;
      	private String GPU; 
      	private String liquidCooler;

        /*include all required parameters*/       
      	public Builder(String processor,String RAM,
      	                       String motherboard,
      	                       String powerSuppply){

      	  this.processor = processor;
      	  this.RAM = RAM;
      	  this.motherboard = motherboard;
      	  this.powerSuppply = powerSuppply;
      	}

        public Builder liquidCooling(String liquidCooler){
          this.liquidCooler = liquidCooler;
          return this;
        }
        
        public Builder externalGPU(String GPU){
          this.GPU = GPU;
          return this;
        }        
         
        public PersonalComputer build(){
          return new PersonalComputer(this);
        }  

    }
}