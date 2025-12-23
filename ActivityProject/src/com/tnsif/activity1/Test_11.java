package com.tnsif.activity1;

class E2 {
    protected int x = 5;
}

class F2 extends E2 {
    int x = 15;

    void print() {
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        F2 obj = new F2();
        obj.print();
    }
}
