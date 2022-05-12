package corso.testered;

public class SchoolStaff extends School implements Registry {
    private String name;
    private String surname;
    private int age;
    private String cf;
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public SchoolStaff() {
    }


    public String getNameSurnameSchool(){
       // System.out.println(getName()+" "+getSurname()+" "+getNameSchool());
        String result = getName()+" "+getSurname()+" " +getSchool();
        return result;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", cf='" + cf + '\'' +
                '}';
    }

}
