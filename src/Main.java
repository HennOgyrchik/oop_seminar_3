import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student stud1=new Student("Евгений","Васильев",1,5);
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
        //studentList.sort(new UserNameComparator());
        //System.out.println(studentList);

       // studentList.sort(new UserNameComparator().reversed());
      //  System.out.println(studentList);

        UserNameComparator<User> compStud = new UserNameComparator<>();

        studentList.sort(compStud);
        //System.out.println(studentList);

        Teacher teacher1 = new Teacher("Олег","Олегов", 10, "Математика", 4.5);
        Teacher teacher2 = new Teacher("Кирилл","Кириллов", 10, "Математика", 4.3);


        List<User> userList = new ArrayList<>();
        userList.add(stud1);
        userList.add(stud2);
        userList.add(teacher1);
        userList.add(teacher2);

        userList.sort(compStud);

        stud1.print();
        teacher2.print();

        Cat cat1 = new Cat();
        cat1.print();


    }
}