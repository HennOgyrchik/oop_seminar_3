import java.util.ArrayList;

public class StudyGroup {
    private ArrayList<Student> students;

    public StudyGroup(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "students=" + students +
                '}';
    }
}
