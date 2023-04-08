package Qn3;
import java.util.Scanner;
public class Person {
	String name,gender,address;
	int age;
	
	
	Person(String name,String gender,String address,int age){
		
		this.name= name;
		this.gender = gender;
		this.address = address;
		this.age= age;
		
	}
	
	
}
class Employee extends Person{
	String company_name,qual;
	int empid;
	Employee(String name, String gender, String address, int age,int empid,String company_name,String qual) {
		super(name, gender, address, age);
		this.empid =empid;
		this.company_name = company_name;
		this.qual =qual;
		
	}


	
	
	
} 
class Teacher extends Employee{
	int tid;
	String sub,dep;
	
	
Teacher(String name, String gender, String address, int age,int empid,String company_name,String qual,String sub,String dep,int tid){
	super(name,gender,  address,  age, empid, company_name, qual);	
	this.sub =sub;
	this.dep =dep;
	this.tid =tid;
	

	
}



}
