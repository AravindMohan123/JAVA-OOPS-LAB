package Co3qn4;
import java.util.*;
class Publisher{
	
String Pubname;
	
	
Publisher(String Pubname){
	this.Pubname= Pubname;
}	
	
	
}

class Books extends Publisher{
	
	String Author;
	Books(String BName,String Pubname){
		super( Pubname);
		this.Author= Author;
		
	}	
	
	
	
}
class Literature extends Books{
	String Lit;
	Literature(String Author,String Pubname,String Lit){
		super(Author,Pubname);
		this.Lit= Lit;
	}
}


class Fiction extends Books{
	
	String fic;
	Fiction(String Author,String Pubname,String fic){
		super(Author,Pubname);
		this.fic =fic;
		
		
	}
	
	
	
	
}
public class result {
	static int t,g;
	static int opt;
	public static void main(String[] args) {
		t=0;
		g=0;
		Scanner scq = new Scanner(System.in);
		Fiction[] obj1 = new Fiction[10];
		Literature[] obj2 = new Literature[10];
		
		
		while(opt != 0) {
			System.out.println("Enter the option\n 1.ADD Data \n 2.display data from fiction \n  3.display data from Literature ");
			opt =scq.nextInt();
			switch(opt) {
			case 1:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the publisher name");
		String pbn = sc.nextLine();
		System.out.println("Enter the Authors name");
		String auth = sc.nextLine();
		System.out.println("Enter the category \n 1.fiction \n Literature");
		int d = sc.nextInt();
		
		if(d == 1) {
			System.out.println("Enter the Literature name");
			Scanner scd = new Scanner(System.in);
			String lt = sc .nextLine();
			obj1[t]= new  Fiction(auth,pbn,lt);
			t++;
			
		}else {
			Scanner scr = new Scanner(System.in);
			System.out.println("Enter the Fiction name");
			String fc = scr.nextLine();
			obj2[g]= new Literature(auth,pbn,fc);
			g++;
			
			
		} 
		break;
		case 2:
			for(int i=0;i<g;i++) {
			System.out.println("Author  = "+obj1[i].Author+"publisher =" +obj1[i].Pubname+ "fiction ="+obj1[i].fic);
			}
			break;
		case 3:
			for(int i=0;i<g;i++) {
			System.out.println("\nAuthor  = "+obj2[i].Author+"\npublisher =" +obj2[i].Pubname+ "\nfiction ="+obj2[i].Lit);
			}
			break;	
		default:
			System.out.println("Wrong input");
		
			}
		}
	}

}
