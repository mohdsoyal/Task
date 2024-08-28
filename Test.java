package task;

public class Test {
	
	 public static void main(String[] args) {
	        Smartphone myPhone = new Smartphone("Oppo", "3456G", "Android", 12.0);

	        
	        myPhone.displaySmartphoneInfo(); 
	        myPhone.takePhoto(); 
	        
	        
	        System.out.println("_________________________________________");
	        
	        
	        Manager m1=new Manager("Mohd Soyal",22,"MS3456","ComputerScience",5);
	   	    m1.DisplayManagerInfo();
	   	    
	   	   Manager m2=new Manager("Sachin",28,"MSDF456","Anudip Faculty",45);
	   	    m2.DisplayManagerInfo();
	      
	    }
	 
}


