package AbstractFactoryPattern;

// credits : https://www.journaldev.com/1418/abstract-factory-design-pattern-in-java

/* AbstractFactoryPattern -  factory of factories*/

/*We have 7 component classes here 
 * 
 *  1) Computer(Abstract) , PC (class) and Server(class) implementing Computer
 *  
 *  2) AbstractComputerFactory(Interface), PCFactory(class) and ServerFactory(class) implementing AbstractComputerFactory
 * 
 *  3) ComputerFactorClass(class) - with a static method which takes in the type of AbstractComputerFactory (PCFactory or ServerFactory)  as a parameter and returns either a PC or Server object 
 *     - This being a cleaner alternative to if loop to create the object 
 *     - This is the bridge between 1) and 2)
 *      
 *   To test the factory, we create the ComputerFactorClass object and pass the required  AbstractComputerFactory object as parameter to static method * 
 * 
 * */


/*create some objects using an abstract class , say we create a computer object with RAM, CPU specs. We have two implementations - *PC build and server build*/

/**/
abstract class Computer {	
	
	String RAM;
	String CPU;
	
	public abstract String getRAM();
	public abstract String getCPU();
	
}


/*To create a PC object */
class PC extends Computer {

	String RAM;
	String CPU;
		
	public PC(String rAM, String cPU) {
		super();
		RAM = rAM;
		CPU = cPU;
	}
	

	@Override
	public String getRAM() {
		return RAM;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return CPU;
	}	
	
}

/*To create a Server object */
class Server extends Computer {
	
	String RAM;
	String CPU;
		
	public Server(String rAM, String cPU) {
		super();
		RAM = rAM;
		CPU = cPU;
	}
	

	@Override
	public String getRAM() {
		return RAM;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return CPU;
	}	
	
	
}


/*The second interface which is used to build PCFactory and ServerFactory classes */
interface ComputerAbstractFactory {
	
	public Computer createComputer();	
	
}



/*instead of using an if loop to decide the type of computer object needed, we leave it to client to use his own factory implementation*/
/*creates concrete PCFactory*/
class PCFactory implements ComputerAbstractFactory {
	
	String RAM;
	String CPU;
	
		
	public PCFactory(String rAM, String cPU) {
		super();
		RAM = rAM;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {	
		return new PC(RAM,CPU); // the actual values are to be got from client only
		
	}
}


/*creates concrete ServerFactory*/
class ServerFactory implements ComputerAbstractFactory {
	
	String RAM;
	String CPU;	
		
	public ServerFactory(String rAM, String cPU) {
		super();
		RAM = rAM;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {
		return new Server(RAM,CPU);
	}	
	
}


/*Bridge between Computer interface and ComputerAbstractFactory  */
class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
		
		return computerAbstractFactory.createComputer(); // we don't yet have an idea of what the client is going to prefer, either a ServerFactory or PCFactory	
		
	}	
	
}



/*Test it out */
public class AbstractFactoryPattern {
	public static void main(String[] args) {
	
		Computer  computer = ComputerFactory.getComputer(new PCFactory("16GB Patriot","AMD Ryzen 5"));
		System.out.println(computer.getRAM());
		System.out.println(computer.getCPU());
	
	}
	
}
