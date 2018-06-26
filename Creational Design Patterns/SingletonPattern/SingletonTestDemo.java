package SingletonPattern;

/**
 * Created by Ajay on 8/31/2016.
 */
public class SingletonTestDemo {

    public static void main(String args[]){

       // Engine eng = new Engine();// will throw error

        //Engine.getEngine(); // will return the only possible Engine object . i.e eng
          Engine en = Engine.getEngine();
               en.printEngineType();

    }

}
