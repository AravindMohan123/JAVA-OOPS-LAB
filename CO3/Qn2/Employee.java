package qn3;

public class Employee {
int empid;
String name;
long salary;
String address;
Employee(int empid,String name,long salary,String address){
	
this.empid = empid;
this.name = name;
this.salary =salary;
this.address = address;
	
	
}
}
class Teacher extends Employee{
	

	String dpt;
	String Sub;
	Teacher(String dpt, String Sub,int empid,String name,long salary,String address){
		super(empid,name,salary,address);
		this.dpt = dpt;
		this.Sub =Sub;
		
		
	}
	
	public void display() {
		
		System.out.println("Empid ::"+empid );
		System.out.println("name ::"+name );
		System.out.println("address ::"+address );
		System.out.println("salary ::"+salary);
		System.out.println("department ::"+dpt );
		System.out.println("subject ::"+Sub);
	}
	
}