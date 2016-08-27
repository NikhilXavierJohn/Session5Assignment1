import java.util.Scanner;

public class SingleInheritance {
	static int length;
	static int width;
	static int height;
	public static void main (String[] args)
	   {
		System.out.print("Enter length :");
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		System.out.print("Enter width :");
		width = sc.nextInt();
		System.out.print("Enter height :");
		height = sc.nextInt();
		area obj= new area();
		obj.Method();
			
		
	}
}
	

class area extends SingleInheritance{
public void Method(){
	System.out.println("Area of Triangle");
	int areaTriangle = (length*height)/2;
	System.out.println("Area is "+ areaTriangle);
	System.out.println("Area of Rectangle");
	int areaRectangle= width*length;
	System.out.println("The Area of Rectangle is: "+areaRectangle);
	}
	
}
	
