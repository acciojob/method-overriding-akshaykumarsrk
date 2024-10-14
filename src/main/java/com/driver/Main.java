package com.driver;

public class Main {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());

        B b2 = new B();
        System.out.println(b2.meth());
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
