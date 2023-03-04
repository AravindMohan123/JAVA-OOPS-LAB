package Qn3;
//import java.util.*;
import java.util.Scanner;
public class ComplexM {
Scanner sc = new Scanner(System.in);
int a,b,c,d;


public  void getdata(){
	
	System.out.println("Enter the constant of eqn1:");
	a = sc.nextInt();
	
	System.out.println("Enter the imaginary part of eqn1:");
	b = sc.nextInt();
	
	System.out.println("Enter the constant of eqn2:");
	c = sc.nextInt();
	
	System.out.println("Enter the imaginary part of eqn2:");
	d = sc.nextInt();
	int e =a+c;
	int f = b+d;
	System.out.println("the sum is =" + e +"+"+ f + "i");
	
	
}






}
