public class Circle extends Shape{
	
    private int radius,x,y;
    
    public Circle(int radius, int x, int y, DrawAPI drawApi){
       super(drawApi);
       this.radius = radius;
       this.x =x;
       this.y = y;

    }

	public void draw(){
       drawApi.drawCircle(radius,x,y);
	}

}