import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
   /* @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }*/
   public int compare(Student o1, Student o2) {
       int resultOfComparing = o1.getLastname().compareTo(o2.getLastname());
       if (resultOfComparing == 0) {
           resultOfComparing = o1.getFirstname().compareTo(o2.getFirstname());
       }
           return resultOfComparing;

   }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}
