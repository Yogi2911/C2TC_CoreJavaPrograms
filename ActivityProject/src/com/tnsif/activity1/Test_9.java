package com.tnsif.activity1;

class C3 {
    final void show() {
        System.out.println("C3");
    }
}

class D3 extends C3 {
    void display() {
        System.out.println("D3");
    }
}

public class Test_9 {
    public static void main(String[] args) {
        C3 obj = new D3();  // Upcasting
        obj.show();          // Calls C3.show() because it's final

        D3 d = new D3();
        d.display();         // Calls D3-specific method
    }
}
