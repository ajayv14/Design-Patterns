package FactoryPattern;

/**
 * Created by Ajay on 8/30/2016.

 */
public class FactoryTestDemo {

    public static void main(String args[]) {

        CarFactory cf = new CarFactory();
          // cf.getCar("VW"); --> returns object for  Volkswagen
          car  cr = cf.getCar("VW");
          cr.carSpecs();

          car cr2 = cf.getCar("Tesla");
          cr2.carSpecs();


    }


}
