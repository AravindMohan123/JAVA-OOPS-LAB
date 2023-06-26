package Qn1cls;
import java.util.*;
import Qn1.*;
class square extends Sqr{
	Scanner sc = new Scanner(System.in);
	public void exec() {
		System.out.println("Enter the side length");
		
		int val = sc.nextInt();
		Sqr sq = new Sqr();
		System.out.println("the area is "+sq.area(val));
		
	}
	
	
	
}
class Rectangle extends Rect{
	Scanner sc = new Scanner(System.in);
	public void exec() {
		System.out.println("Enter the length and breadth of the shape");
		int l =sc.nextInt();
		int b =sc.nextInt();
		Rect r = new Rect();
		System.out.println("the area is "+r.area(l, b));
		
		
	}
	
	
	
}
 class Circ implements Circle{
	Scanner sc = new Scanner(System.in);
	public void area() {
		
		
		
		
	
	
		System.out.println("Enter the radius of the shape");
		int r =sc.nextInt();
		float ar =  (float) (3.14*r*r); 
		System.out.println("the area is "+ar);
		
		
	}
	
	
	
}
 class Tria implements Tri{
	Scanner sc = new Scanner(System.in);
	public void area() {
		
		
		
		
	
	
		System.out.println("Enter the braedth and heigth  of the shape");
		int b =sc.nextInt();
		int h =sc.nextInt();
		int ar = 1/2*(b*h);
		System.out.println("the area is "+ar);
		
		
	}
	
	
	
}
public class qn1cls  {

	public static void main(String args[]) {
		
		int  i=10;
		Scanner sc =new Scanner(System.in);
		while(i != 0) {
			System.out.println("Choose the shape\n1.Square\n2.rectangle\n3.circle\n4.triangle\n");
			i = sc.nextInt();
			switch(i) {
			case 1:
				square sq =new square();
				sq.exec();
				break;
				
			case 2:
				Rectangle r = new Rectangle();
				r.exec();
				break;
				
			case 3:
				Circ c = new Circ();
				c.area();
				break;
			case 4:
				Tria t = new Tria();
				t.area();
				break;
				
			
			
			}
			
			
		}
		
		
		
		
		
	}
	
	
}
