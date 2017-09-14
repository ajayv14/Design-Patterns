//abstract class using the DrawApinterface
public abstract class Shape {
	protected DrawAPI drawApi;
     
    //constructor 
    protected Shape(DrawAPI drawApi){
      this.drawApi = drawApi;
    }

	public abstract void draw();
}