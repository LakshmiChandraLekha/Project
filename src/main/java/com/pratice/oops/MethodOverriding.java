package com.pratice.oops;
public class MethodOverriding extends Child {

    @Override
    public void test2() {
        super.test2();
        System.out.println("sucessfully test2 method completed");
    }

    public static void main(String[] args) {

        MethodOverriding m = new MethodOverriding();
                m.test2();
    }
}

