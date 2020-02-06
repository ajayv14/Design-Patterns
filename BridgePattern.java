//credits : https://www.journaldev.com/1491/bridge-design-pattern-java

/*objective : to decouple an abstraction from its implementation so that the two can vary independently. Also it follows the notion 
   to prefer Composition over inheritance.*/

interface Color {
   public void applyColor();
}

/* 1) concrete implementation of interface color */
class RedColor implements Color {

   @Override
   public void applyColor(){
      System.out.println("painted Red");
   }
}

/* 1) concrete implementation of interface color */
class GreenColor implements Color {
   
   @Override
   public void applyColor(){
      System.out.println("painted Green");
   }   
}

/*Bridge interface*/
abstract class Shape {

   //composition
   protected Color color; // setting it private is not desirable, will restrict access inside concrete impl

   public Shape(Color color){
      this.color = color;   
   }
   
   public abstract void drawShape();
}

/*concrete impl*/
class Triangle extends Shape {
   
   public Triangle(Color color){
      super(color);
   }
   
   public void drawShape(){
      System.out.println("A Triangle");
      color.applyColor();  
   }

}

/*concrete impl*/
class Rectangle extends Shape {
   
   public Rectangle(Color color){
      super(color);
   }
   
   public void drawShape(){
      System.out.println("A Rectangle");
      color.applyColor();  
   }

}


class BridgePattern {

   public static void main(String[] args){
      
      Shape s1 = new Triangle(new RedColor());
      s1.drawShape();
   
   }
}
