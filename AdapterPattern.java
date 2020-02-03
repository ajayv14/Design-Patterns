// credits : https://www.journaldev.com/1487/adapter-design-pattern-java

/*Objective : Pattern to unite two unrelated interfaces to make them work together. The object that joins these unrelated interfaces is called an Adapter */

/*to represent voltage*/
class Voltage {
   
   private int volt;   
   
   public Voltage(int volt){
      this.volt = volt;
   }  
   
   public int getVolt(){
      return volt;
   }         
}

/*a Class to deliver the voltage(imaginary socket)*/
class Socket {
   
   public Voltage getVolt(){
      return new Voltage(120); // voltage in USA
   }   
}

/*Now we need an interface to convert 120 to 24 and  volts as required by specific car and phones*/
interface SocketAdapter {

   public Voltage get24Volt();
   public Voltage get5Volt();    

}

/*here a private method is the highlight, which is used to convert or  the one which adapts*/
class SocketAdapterImpl implements SocketAdapter {
   
   // we also need a socket object to get the original volt(120) to be converted
   // Socket object created using composition  
   private Socket socket = new Socket();
   
   public Voltage get24Volt(){
      Voltage v = socket.getVolt();
      return  convertTo(v,5);     
   }
   
   public Voltage get5Volt(){
      Voltage v = socket.getVolt();
      return convertTo(v,24);
   }
   
   private Voltage convertTo(Voltage v, int factor){
      return new Voltage(v.getVolt()/factor);
   }

}
 
/*Test*/
class AdapterPattern {

   public static void main(String[] args){
      
      Socket soc = new Socket();
      System.out.println(soc.getVolt());
      
      SocketAdapterImpl  obj = new SocketAdapterImpl();
      Voltage v1 = obj.get24Volt();
      System.out.println(v1.getVolt());

      Voltage v2 = obj.get5Volt();
      System.out.println(v2.getVolt());            
   }  

}