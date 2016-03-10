import java.util.*;

public class RectangleTester
{	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
        	try
        	{
        		System.out.println("Please code in the details of Rectangle one.");
        		System.out.print("Height:");
        		float h1 = input.nextFloat();
        		System.out.print("Width:");
        		float w1 = input.nextFloat();
        		System.out.print("x:");
        		float x1 = input.nextFloat();
        		System.out.print("y:");
        		float y1 = input.nextFloat();
        		Rectangle abc=new Rectangle(h1,w1,x1,y1);
        		System.out.print(abc.toString());
        		System.out.println("\n\nPlease code in the details of Rectangle two.");
        		
        		System.out.print("Height:");
        		float h2 = input.nextFloat();
        		System.out.print("Width:");
        		float w2 = input.nextFloat();
        		System.out.print("x:");
        		float x2 = input.nextFloat();
        		System.out.print("y:");
        		float y2 = input.nextFloat();
        		Rectangle two=new Rectangle(h2,w2,x2,y2);
        		System.out.print(two.toString());
        	}
        	catch(Exception e)
        	{
        		System.out.println("Error ! Please try again !");
        	}
	}	
	}
	
	
	
