package com.pratice.oops;

public class AccessModifier {

    public static void test1() {
        System.out.println("Testl method");
    }
    private static void test2(){
        System.out.println("test2 method");
    }
    protected static void test3(){
        System.out.println("test3 method");
    }
    static void test4(){
        System.out.println("test4 method");
    }

    public static void main(String[] args) {
        AccessModifier.test1();
        AccessModifier.test2();
        AccessModifier.test3();
        AccessModifier.test4();
    }



}
