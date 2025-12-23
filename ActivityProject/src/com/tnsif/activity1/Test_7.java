package com.tnsif.activity1;

import java.util.Scanner;

class C1 {}
class D1 extends C1 {}

public class Test_7 {
    public static void main(String[] args) {

        C1 obj = new D1();   // Upcasting
        C1 b = (C1) obj;    // Downcasting not needed, but valid

        System.out.println("Casting successful");

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();   // example input
        System.out.println(n);
    }
}
