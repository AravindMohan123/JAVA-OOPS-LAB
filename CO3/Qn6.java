package Co3qn4;
import java.util.*;
interface area {
	
	int area1(int l,int b);
	double area2(int r);
	int per1(int l,int b);
	double per2(int r);

}
class Dxt implements area{
	
	public int area1(int  l,int  b) {
		
		return l *b;	
		}
	public double area2(int r) {
				
		return 3.14 * r * r;	
		}
	public  int per1(int l,int b) {
				
		return 2*(l +b);	
		}
	public  double per2(int r) {
						
		return 3.14 * r * 2;	
		}
	
	
	
}


public class Qarea {
	static int c;
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dxt d = new Dxt();
		while(c != 0){
			System.out.println("Choose your option \n 1.area of rectangle \n 2.area of circle \n 3.perimeter of rectangle \n 4. perimeter of circle");
			c = sc.nextInt();
			switch(c) {
			case 1:
			System.out.println("Enter the length and breadth");
			int l = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("\narea is " +  d.area1(l,b)+"\n");
			break;
			case 2:
				System.out.println("Enter the radius");
				int r = sc.nextInt();
				System.out.println("\narea is " +  d.area2(r)+"\n");
				break;
			case 3:
				System.out.println("Enter the length and breadth");
				int t = sc.nextInt();
				int v = sc.nextInt();
				System.out.println("\nperimeter  is " +  d.per1(t,v)+"\n");
				break;
			case 4:
				System.out.println("Enter the length and breadth");
				int g = sc.nextInt();
				System.out.println("\nperimeter  is " +  d.per2(g)+"\n");
				break;
			}
		}
		
		
	}

}
