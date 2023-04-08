package Qn7;

import java.util.Scanner;

interface OrderNo{
int calculate(int qty ,int uprice);	
	
}

class OrderId implements OrderNo {
	int pdtid,qty,uprice,total;
	String name;
	
	OrderId(int pdtid,String name,int qty,int uprice,int total){
		
		
		this.pdtid = pdtid;
		this.name = name;
		this.qty= qty;
		this.uprice = uprice;
		this.total = calculate(qty,uprice);
		
		
		
	}
	
	public int  calculate(int qty, int uprice) {
		
		return qty * uprice;
		
	}

}



public class ordrDet{
	static int d=3,i=0;
	 
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		OrderId[] obj = new OrderId[10];
		
		while (d != 0) {
		System.out.println("Choose from the following options\n1.Add item\n2.Display bill\n");
			d= sc.nextInt();
			switch(d) {
			case 1:
			System.out.println("Enter the pid");
			int pid = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the qty");
			int qty = sc.nextInt();
			System.out.println("Enter the unit price");
			int uprice = sc.nextInt();
			int total =0;
			obj[i] = new OrderId(pid,name,qty,uprice,total);
			i++;
		break;
			case 2:
				System.out.println("date: \nProduct id\tname\tquantity\tunitprice\ttotal\t");
				System.out.println("____________________________________________________________");
				int netAmt=0;
				for(int j =0;j<i;j++) {
				System.out.println(obj[j].pdtid+"\t\t"+obj[j].name+"\t\t"+obj[j].qty+"\t\t"+obj[j].uprice+"\t"+obj[j].total+"\n\n");
				netAmt = netAmt + obj[j].total;
				System.out.println("\t\t\t\t\t\t\tNet amount :"+netAmt);
				}
			break;	
			default:
				System.out.println("Wrong choice");
				
			}
	}
	}
	
}
