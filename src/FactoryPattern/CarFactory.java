package FactoryPattern;

/**
 * Created by Ajay on 8/30/2016.

 Factory class, containing method getCar which returns the respective object.

 */
public class CarFactory {

    String carmaker;

    public car getCar(String carMaker) {

        if (carMaker.equals("VW")) return new Volkswagen();

        if (carMaker.equals("Tesla")) return new Tesla();

        else return null;

    }


}
