package Qn5;

public class MainInner {
	public static void main(String args[]){
		Cpu obj1 = new Cpu(); 
		Cpu.Processor obj2 = new Cpu.Processor(); 
		Cpu.Processor.Ram obj = new Cpu.Processor.Ram();
		
		obj1.price= 30000;
		obj.memory=12;
		obj.mfg = "strontium";
		obj2.cores =6;
		obj2.manufacturer = "Intel";
		obj.display();
		
	}

}
