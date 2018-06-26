public class FacadePatternTest{ 

    public static void main(String []args){
        System.out.println("Hello World");
          
         ShapeCreator sh = new ShapeCreator();
         sh.drawSquare();
         sh.drawCircle();

         System.out.println("Completed");
         
         
    }
}
