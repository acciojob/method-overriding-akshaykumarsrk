package com.driver;

public class Main {

    public static void main(String[] args) {
        B b = new B();
        String res = b.meth();
        System.out.println(res);
    }

    public static class A {
        String meth()
        {
            return "Invoking method from class A";
        }
    }
    static class B extends A {
    @Override
        String meth()
        {
            return "Method is overridden in Extended class B";
        }
    }
}
