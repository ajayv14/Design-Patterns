package AbstractFactoryPattern;

/**
 * Created by Ajay on 8/30/2016.
 */
public abstract class AbstractFactory {

  abstract Car getCar(String myCar);
  abstract Bank getBank(String bank);

}
