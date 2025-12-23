package com.tnsif.interfacedemo;

interface project{
	void show();
}

public class InterfaceDemo {
	void show() {
		System.out.println("welcome to project");
	}
public static void main(String[] args) {
	InterfaceDemo p = new InterfaceDemo();
	p.show();
	
	
}

}
