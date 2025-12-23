package com.tnsif.activity1;

class A1 {
    A1() {
        System.out.print("A Constructor ");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("B Constructor");
    }
}

public class Test_2 {
    public static void main(String[] args) {
        A1 obj = new B1();
    }
}

