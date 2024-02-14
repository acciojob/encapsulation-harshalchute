package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
//        rwOnly.name = "XYZ";
//        System.out.print(name);
//      name has private access in com.driver.RWOnly

        rwOnly.setName("ABC");
        System.out.println(rwOnly.getName());
    }
}