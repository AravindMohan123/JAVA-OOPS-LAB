package Qn2;

public class Arr {
public void  search(int arr[],int sr) {
	for (int i=0;i<arr.length;i++)
	if(sr == arr[i]) {
		
		System.out.println("Item found at position " + i +" of the array");
		break;
	}else {
		System.out.println("Item not found");
	}
}
}
