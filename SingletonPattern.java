
//credits: https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
import java.lang.reflect.Constructor;

/*ensures that only one instance of the class exists in JVM*/

class Database {
   
   private static volatile Database database;
   
  /*private constructor to prevent creating multiple instance of this class*/
   private Database(){
            
   }

   /*a static method to return a private instance of the class*/
    public static Database getConnecti synchronized(Database.class){
         
         if(database == null){
            database = new Database();
         }              
         return database;         
    }
}

/* Test */
class SingletonPattern {

	public static void main(String[] args) {

		// Database db = new Database();
		Database obj = Database.getConnection();

		// The above approach can be defeated by using java reflections
		Database duplicateObj = null;

		try {
			Constructor[] constructors = Database.class.getDeclaredConstructors();

			for (Constructor c : constructors) {
				c.setAccessible(true);
				duplicateObj = (Database) c.newInstance();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(obj);
		System.out.println(duplicateObj);

	}
}
