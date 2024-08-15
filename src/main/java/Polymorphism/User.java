package Polymorphism;

public class User {
    public static void main(String[] args) {

        parent p = new child(); // upcasting --> if we want to access the overridden methods in parent class inheritance should be there
        p.test();
        p.testcase();
        child c = (child) p; // downcasting --> if we want to access the child methods with the help of parent type of object
        c.test();
        c.testcase();


    }
}
