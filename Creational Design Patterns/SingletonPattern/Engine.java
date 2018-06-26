package SingletonPattern;

/**
 * Created by Ajay on 8/31/2016.
 */
public class Engine {

//private constructor to prevent creating multiple instance of this class
private Engine(){};

//private static single instance of this class
private static Engine eng = new Engine();

// return the only available single object
public static Engine getEngine(){
      return eng;
}

//some function
public void printEngineType(){

    System.out.println("This is a 3000cc petrol engine");

}

}
