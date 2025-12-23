package com.tnsif.oops.inheritance.multipleinheritance;
//Two interface class
interface Project{
	void show();
}

interface Java{
	void draw();
}
//implement the above 2 interface to another class
class Human implements Project,Java{
	@Override
	public void show () {
		System.out.println("welcome");
	}
	@Override
	public void draw() {
		System.out.println("This is our Program");
	}
}
public class MultipleInheritance {
	public static void main(String[]args) {
		Human obj = new Human();
		obj.show();
		obj.draw();
	}

}
