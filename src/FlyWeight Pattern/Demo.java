public class Demo{

 private static final String[] colors = {"Red","Yellow","Green","Blue","Violet"}; 
  
 public static void main(String[] args){
  
  for(int i=0;i<10;i++){
   	Circle circle = (Circle)ShapeFactory.getShape(getRandColor());
    circle.setX(getRandX());
    circle.setY(getRandY());
    circle.setRadius(50);
    circle.draw();

  }
}	


 public static String getRandColor(){
  return colors[(int)(Math.random()*colors.length)];
 }

 public static int getRandX(){
   return (int)(Math.random()*100);
 }

 public static int getRandY(){
   return (int)(Math.random()*100);
 }


 }