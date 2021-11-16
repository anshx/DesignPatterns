package com.example.driver;

import com.example.model.Student;

public class StudentMainApplication {
    public static void main(String[] args) {

        Student student = Student.Builder.getBuilder()
                .setName("Anshuman")
                .setAddress("Bhubaneswar")
                .setPsp("80%")
                .build();

        System.out.println(student);
    }
}
