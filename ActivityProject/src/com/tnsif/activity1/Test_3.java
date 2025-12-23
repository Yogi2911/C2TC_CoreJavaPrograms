package com.tnsif.activity1;

class Test_3 {
    int x;
    int y;

    Test_3(int x) {
        x = 10;   
    }

    void display() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Test_3 obj = new Test_3(5);
        obj.display();
    }
}
