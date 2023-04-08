package Qn7;

import java.util.Scanner;
class Student{
	int rollno;
	double cgpa;
	String name,dep;
	
	Student(int rollno,double cgpa,String name,String dep){
		this.rollno = rollno;
		this.name =name;
		this.cgpa = cgpa;
		this.dep= dep;
	}

}

class Sports extends Student {
String[] sname = new String[5];
int n;
Scanner sc = new Scanner(System.in);
Sports(int rollno,double cgpa,String name,String dep,String sname[],int n){
	super(rollno,cgpa,name,dep);
	System.out.println("Enter the total sports item");
		n = sc.nextInt();
		this.n =n;
		for(int j =0 ;j<n;j++) {
			System.out.println("Enter sport" + j);
			
			sname[j] =sc.next();
			this.sname[j]= sname[j];
		}
		
}
	
}

class Result extends Sports{
	
	Result(int rollno,double cgpa,String name,String dep,String[] sname,int n){
		super(rollno,cgpa,name,dep,sname,n);
		
		
	}
	public void display() {
		
		System.out.println("Student details");
		System.out.println("_________________");
		
		System.out.println("Roll no:"+rollno+"\nName:"+name);
		System.out.println("Academic details");
		System.out.println("CGPA :"+cgpa);
		System.out.println("Sports details");
		for(int i =0;i<n;i++) {
		System.out.println("Sports item"+i+" :"+sname[i]);
		}
	}
	
	
}
public class StudentDet {
	static int i,d=3,n;
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String sname[] = new String[5];
		Result[] r = new Result[10];
		while(d !=0) {
		System.out.println("Choose from the following\n1.Add student\n2.Display student details\n\n");
		d= sc.nextInt();
		switch(d) {
		case 1:
			System.out.println("Enter roll no");
			int roll = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the cgpa");
			double cgpa = sc.nextDouble();
			System.out.println("Enter the department");
			String dep = sc.next();
			System.out.println("Enter the sports details");
			r[i] = new Result(roll,cgpa,name,dep,sname,n);
			i++;
		
		break;
		case 2:
			System.out.println("Enter object id");
			int g =sc.nextInt();
			r[g].display();
		}	
		}
		
		
	}
	
	
}
