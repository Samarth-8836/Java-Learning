package com.patelsamarth;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        char abc[] = {'a','b','c','d'};
        char xyz[] = new char[3];
        System.arraycopy(abc, 1, xyz, 0, 3);
        System.out.println(xyz);
        String pqr = "bcdx";
        String qqq = "bcdq";
        System.out.println(qqq.compareTo(pqr));
    }
}