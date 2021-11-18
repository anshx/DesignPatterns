package com.singleton.driver;

import com.singleton.model.Employee;

public class MainApplication {
    public static void main(String[] args) {
        Employee e1 = Employee.INSTANCE;
        Employee e2 = Employee.INSTANCE;
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
