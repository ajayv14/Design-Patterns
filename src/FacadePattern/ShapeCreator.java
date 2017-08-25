//facade class
public class ShapeCreator{
    
    private Shape square;
    private Shape circle;
    
    //constructor
    public ShapeCreator(){
        square = new Square();
        circle = new Circle();
    }

    public void drawCircle(){
     circle.draw();        
        
    }
    
    public void drawSquare(){
        square.draw();
    }
    
} 