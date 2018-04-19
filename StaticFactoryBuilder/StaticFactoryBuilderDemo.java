

public class StaticFactoryBuilderDemo{
    
    public static void main(String[] args){
      
      PersonalComputer PC = new PersonalComputer.Builder("Intel-i-9k","z-370","DDR4-2666","Gold PSU")
                                                                    .externalGPU("NVIDIA GTX 1080")
                                                                    .liquidCooling("cool air")
                                                                    .build(); 
      System.out.println(PC.getProcessor());                                                                    
    }
}