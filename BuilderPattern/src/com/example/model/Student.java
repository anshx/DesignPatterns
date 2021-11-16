package com.example.model;

/*
1. Generate inner builder class with same attributes
2. Generate setters
3. Validate the values
4. Build the parent obj from build method
*/

public class Student {
    private String name;
    private String address;
    private String psp;

    private Student() {}

    public static class Builder {
        private String name;
        private String address;
        private String psp;

       public static Builder getBuilder() {
            return new Builder();
       }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPsp(String psp) {
            this.psp = psp;
            return this;
        }

        public boolean validate() {
            return true;
        }

        public Student build() {
            Student student = new Student();
            student.address = this.address;
            student.name = this.name;
            student.psp = this.psp;
            return student;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", psp='" + psp + '\'' +
                '}';
    }
}
