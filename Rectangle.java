
public class Rectangle {

	float height,weight,x,y;
	
	public Rectangle(float a,float b,float c,float d)
	{
		height=a;
		weight=b;
		x=c;
		y=d;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public float getWeight()
	{
		return weight;
	}
	
	public String toString()
	{
		String a="height=%.2f,weight=%.2f,x=%.2f,y=%.2f";
		String b="\nArea=%.2f";
		String c="\nPerimeter=%.2f";
		return String.format(a,height,weight,x,y)+String.format(b,height*weight)+String.format(c,height*2+weight*2);
	}
}
