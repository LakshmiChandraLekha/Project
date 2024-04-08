package com.pratice.oops;

public class MethodOverloading extends Child{

    public void login(String username,String password){
        System.out.println("UserName" + username);
        System.out.println("Password" + password);
    }
    public void login(long phonenum, int password){
        System.out.println("phonenumber " + phonenum);
        System.out.println("password " + password);
    }
    public int login(int a){
        return a;
    }


    public static void main(String[] args) {

        MethodOverloading m =new MethodOverloading();
        m.login(" lekha"," 12345@");
        m.login(7654654653l,1234);
        System.out.println("a= " + m.login(456546));
        //Child c = new Child();
        m.test1();
        m.test2();

        AccessModifier.test1();
        AccessModifier.test4();
        AccessModifier.test3();

    }



}
