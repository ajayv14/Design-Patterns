/*objective - return a subclass when we have many subclass under a superclass, based on input from client*/

/*Abstract Super class*/
abstract class Chocolate {
   
   String name;
   float cocoa;
   
   public abstract Chocolate getChocolate(); 
   
   public String toString(){
      return "Chocloate : ["+name+","+cocoa+"]";
   }  
   
}

/*subclass 1 of chocolate*/
class DarkChocolate extends Chocolate {
      
      public DarkChocolate(String name, float cocoa){
         this.name = name;
         this.cocoa = cocoa;
      }
      
      @Override
      public Chocolate getChocolate(){
         return this;      
      }
}


/*subclass 2 of chocolate*/
class MilkChocolate extends Chocolate {
      
      public MilkChocolate(String name, float cocoa){
         this.name = name;
         this.cocoa = cocoa;
      }
      
      @Override
      public Chocolate getChocolate(){
         return this;      
      }
}

/*factory class to make a choice and return a subclass*/
class ChocolateFactory {
   
   public static Chocolate getInstance(String chocolateType, String name, float cocoa){
      
         if(chocolateType == "darkchocolate") return new DarkChocolate(name, cocoa);
         if(chocolateType == "milkchocolate") return new MilkChocolate(name, cocoa);
         else return null;            
   } 
}

/*Test*/
class FactoryDesignPattern{

   public static void main(String[] args){
      Chocolate ch = ChocolateFactory.getInstance("darkchocolate","darklab",0.70f);  
      System.out.println(ch);
   }
}