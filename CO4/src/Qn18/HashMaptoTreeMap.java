package Qn18;
import java.util.*;
public class HashMaptoTreeMap {

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map <Integer,String> hm = new HashMap<Integer,String>();
		Map <Integer,String> tm = new TreeMap<Integer,String>();
		
		hm.put(1, "rais");
		hm.put(4, "amal");
		hm.put(3, "aravind");
		hm.put(2, "arjun");
	
	System.out.println("Hash map :" +hm+"\n enter 1 to convert to tree map");
	
	int  n= sc.nextInt();
	if(n==1){
	tm.putAll(hm);
	System.out.println("Tree map :"+tm);	
	}
	}
	
	
	
}
