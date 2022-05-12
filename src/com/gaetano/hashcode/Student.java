package com.hashcode;

import com.Student.UtilityStudent;

import java.util.Objects;

public class Student {
        private String name;
        private String surname;
        private Integer id;
        private Integer age;
        private String city;

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
        return name.equals(student.name) && surname.equals(student.surname) && id.equals(student.id) && age.equals(student.age) && city.equals(student.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
