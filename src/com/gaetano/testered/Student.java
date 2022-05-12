package corso.testered;

public class Student extends SchoolStaff implements Registry {
    public int average;
    public String clas;
    public School school;

    @Override
    public String toString() {
        return "Student{" +
                "nameSchool='" + nameSchool + '\'' +
                ", citySchool='" + citySchool + '\'' +
                ", addressSchool='" + addressSchool + '\'' +
                '}';
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
}


