package com.gaetano.hashcode;


import java.util.Objects;

public class Student implements Comparable<Student> {
        private String name;
        private String surname;
        private Integer id;
        private Integer age;
        private String city;

    public Student(String name, String surname, Integer id, Integer age, String city) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
        this.city = city;
    }

    public Student() {
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", id=" + id +
                    ", age=" + age +
                    ", city='" + city + '\'' +
                    '}';
        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.getId());
    }
}
