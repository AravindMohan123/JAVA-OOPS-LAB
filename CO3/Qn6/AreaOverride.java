package Qn6;
import java.util.Scanner;
interface dimensions{
	
double area();	
double perimeter();	
	
	
}

class Rectangle implements dimensions{
	int l ,b;
	public int getdata(int a,int c){
		
		l =a;
		b = c;
		
		return 0;
	}
	
	public double area(){
		
		
		return l *b;
	}
	
	public double perimeter(){
		
		
		return 2*(l+b);
	}
	
} 


class Circle implements dimensions{
	int r;
	public int getdata(int a){
		r =a;
		return r;
	}
	
	
	public double area(){
		
		
		return 3.14 *r*r;
	}
	
	public double perimeter(){
		
		
		return 2*3.14*r;
	}
	
} 



public class AreaOverride {
	public static void main(String[] args){

		Rectangle Robj = new Rectangle();
		Circle Cobj = new Circle();

		
		int d=7;
		Scanner sc = new Scanner(System.in);
		while(d !=0){
		System.out.println("Choose from the following option\n1.Area of Rectangle \n 2.Perimeter of Rectangle\n 3.Area of Circle \n 4.Perimeter of Circle\n");
		d =sc.nextInt();
		switch(d){
		
		case 1:
			System.out.println("Enter the length and breadth");
			int l = sc.nextInt();
			int b = sc.nextInt();
			
			Robj.getdata(l,b);
			System.out.println("Area is ::" + Robj.area());
			break;
		
		case 2:
				
			System.out.println("Enter the length and breadth");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			Robj.getdata(x,y);
		System.out.println("Perimeter of rectangle" +	Robj.perimeter());
	
			
			break;
			
			
		case 3:
			System.out.println("Enter the radius");
			int r = sc.nextInt();
			
			Cobj.getdata(r);
			System.out.println("Area is" + Cobj.area());
			break; 
		case 4:
			System.out.println("Enter the radius");
			int ra = sc.nextInt();
			System.out.println("Perimeter is  ::"+ Cobj.perimeter());
			Cobj.getdata(ra);
			break;
		
		}
		
	}
	
	}
	
	
}
