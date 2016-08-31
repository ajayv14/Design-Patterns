package AbstractFactoryPattern;

/**
 * Created by Ajay on 8/31/2016.
 */
public class AbstractFactoryTestDemo {

    public static void main(String args[]){

        Factory fc = new Factory();

        // fc.getCar("Tesla"); // returns object for Tesla class
        Car cr = fc.getCar("Tesla");
          cr.carSpecs();

        //fc.getBank("Chase");
        Bank bnk = fc.getBank("Chase");
          bnk.loanBank();
    }



}
