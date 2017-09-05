import java.util.HashMap;

public class ShapeFactory{
 
 private static final HashMap<String,Shape> circleHM = new HashMap<>();
 
 public static Shape getShape(String color){

 Circle circle =  (Circle)circleHM.get(color); // fetch circle object if present

 if(circle == null){
   
   circle = new Circle(color);
   circleHM.put(color, circle);
   System.out.println("new circle created with color"+color);

 } 
 return circle;
 }
}


