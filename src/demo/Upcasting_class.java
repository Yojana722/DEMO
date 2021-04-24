package demo;

public class Upcasting_class {

	public static void main(String[] args) {
	
		
		parent_class p = new child_class();
		p.Money();
		
		child_class c = (child_class)p;
		c.Home();
		c.Bike();
		
		
       
	
	}
}
