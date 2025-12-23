package com.tnsif.activity1;

class C2 {
    void show(int a) {
        System.out.println("C2: " + a);
    }
}

class D2 extends C2 {
    @Override
    void show(int a) {
        System.out.println("D2: " + a);
    }
}

public class Test_8 {
    public static void main(String[] args) {
        int a = 10;             // define variable
        C2 obj = new D2();      // upcasting
        obj.show(a);            // calls D2.show()
    }
}

