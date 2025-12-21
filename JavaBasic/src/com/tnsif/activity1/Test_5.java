package com.tnsif.activity1;

public class Test_5 {

	static class A3 {
	    void display() {
	        System.out.println("A display");
	       display();
	    }
	}

	static class B3 extends A3 {
		void display() {
	
		System.out.println("B display");
		}
	    
		public static void main(String[] args) {
			 A3 obj1 = new A3();
		        obj1.display();   // Calls A3 display

		        A3 obj2 = new B3();
		        obj2.display();   // Calls B3 display
		}
	    
	       
	    }
}


