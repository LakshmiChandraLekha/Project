package com.pratice.oops;

public  class Abstract2 extends Abstract {

    @Override
    public void minbal() {
        int i=500;
        System.out.println("min balance is " + i);
    }

    @Override
    public void rateofinterest() {
        String s = "16%";
        System.out.println("rate of interest is " + s);
    }
}
