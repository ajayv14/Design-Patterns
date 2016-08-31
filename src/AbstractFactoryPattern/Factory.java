package AbstractFactoryPattern;

/**
 * Created by Ajay on 8/30/2016.
 */
public class Factory extends AbstractFactory{


   public Car getCar(String myCar){ // note return type is Car

       if(myCar.equals("VW")) return new Volkawagen();

       if(myCar.equals(("Tesla"))) return new Tesla();

       else return null;
   }

   public Bank getBank(String bank){ // note return type is Bank

       if(bank.equals("Chase")) return new Chase();
       if(bank.equals("WellsFargo")) return new WellsFargo();

       else return null;

   }




}
