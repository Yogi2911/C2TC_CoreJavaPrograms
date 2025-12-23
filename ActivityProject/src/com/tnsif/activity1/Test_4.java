package com.tnsif.activity1;

class A2 {
    int x = 10;
}

class Test_4 extends A2 {
    int x = 20;

    public String toString() {
        return "x" + x;
    }

    public static void main(String[] args) {
    	Test_4 b = new Test_4();
        System.out.println(b.toString());
    }
}
