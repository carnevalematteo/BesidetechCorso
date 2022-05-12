package corso.testered;

public class TestforSchool {
    public static void main(String[] args) {
        Student student =new Student();
        Teacher teacher= new Teacher();
        School school= new School();
        student.setAverage(24);
        student.setName("Mark");
        student.setSurname("Lenders");
        student.setAge(16);
        student.setCf("MRKLND5433");
        school.setCitySchool("NY");
        school.setAddressSchool("Street");
        school.setNameSchool("Washington");
        student.getNameSurnameSchool();
        student.setSchool(school);
        System.out.println(student.getNameSurnameSchool());






    }
}
