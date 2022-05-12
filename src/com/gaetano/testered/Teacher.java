package corso.testered;

public class Teacher extends SchoolStaff {
    public String subjectTeach;
    public School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getSubjectTeach() {
        return subjectTeach;
    }

    public void setSubjectTeach(String subjectTeach) {
        this.subjectTeach = subjectTeach;
    }
}
