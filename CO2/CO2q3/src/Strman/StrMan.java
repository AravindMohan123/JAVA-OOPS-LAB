package Strman;

public class StrMan {

	public void posi(String st,int a) {
		
		char d = st.charAt(a);
		System.out.println("The character at position"+ a+"is " +d );
		
	}
	public void upper(String st) {
		String u = st.toUpperCase();
		System.out.println("the uppercase = "+ u);
	}public void lower(String st) {
		
		String u = st.toLowerCase();
		System.out.println("the lowercase = "+ u);
			
		
	}public void rpl(String st ,String a,String b) {
		
		String f = st.replace(a,b);
		System.out.println("after replacing ="+ f);
		
	}public void len(String st) {
		System.out.println("The length = "+ st.length());
		
	}
	
	
	
	
	
	
	
	
}
