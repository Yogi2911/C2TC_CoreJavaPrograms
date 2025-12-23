package com.tnsif.activity1;

class A3 {
    void display() {
        System.out.println("A display");
    }
}

class Test_5 extends A3 {

    @Override
    void display() {
        System.out.println("B display");
    }

    public static void main(String[] args) {
        A3 obj = new Test_5();
        obj.display();
    }
}
