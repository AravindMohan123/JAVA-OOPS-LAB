package Qn12;
import java.util.*;
public class Qn12 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n =10;
	Stack<Integer> st = new Stack<Integer>(); 
	while(n != 0){
	System.out.println("Choose from the following options \n 1.push Element\n2.pop element\n3.pass argument\n4.display");
	n = sc.nextInt();
	switch(n){
	case 1:
		System.out.println("Enter the integer");
		int i = sc.nextInt();
		st.push(i);
		break;
	case 2:
		st.pop();
		break;
	case 3:
		System.out.println("Enter the position");
		int t = sc.nextInt();
		st.remove(t);
		break;
	case 4:
		System.out.println("Stack  : "+ st);
		break;
	}
	}
}
}
