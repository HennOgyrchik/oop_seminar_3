import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student stud1=new Student("Вася","Васильев",1,5);
        Student stud2=new Student("Яков","Иванов",2,1);
        Student stud3=new Student("Петя","Петров",3,3);
        Student stud4=new Student("Вася","Петров",4,2);

        List<Student> studentList=new ArrayList<>();
        studentList.add(stud1);
        studentList.add(stud2);
        studentList.add(stud3);
        studentList.add(stud4);

       // StudyGroup group1 = new StudyGroup(studentList);

        //GroupStudyIterator studentsIterator = new GroupStudyIterator(group1);

       /* while (studentsIterator.hasNext()){
            Student current = studentsIterator.next();
            if (current.getMeanBall()<4){
                studentsIterator.remove();
            }

        }*/

        //Collections.sort(studentList);
        studentList.sort(new StudentNameComparator());
        System.out.println(studentList);

        studentList.sort(new StudentNameComparator().reversed());
        System.out.println(studentList);


    }
}