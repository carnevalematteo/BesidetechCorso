package esArrList;
import java.util.ArrayList;

public interface InterfEs1  {

    void addstudent(StudenteEs1 student, ArrayList<StudenteEs1> listaStudenti);

    void deleteStudent(int id, ArrayList<StudenteEs1> listaStudenti);

    void editStudent(StudenteEs1 x, ArrayList<StudenteEs1> listaStudenti);

    StudenteEs1 searchStudent(int id, ArrayList<StudenteEs1> listaStudenti);
}
