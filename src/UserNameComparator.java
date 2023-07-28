import java.util.Comparator;

public class UserNameComparator<T extends User> implements Comparator<T> {
   /* @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }*/
 /*  public int compare(Student o1, Student o2) {
       int resultOfComparing = o1.getLastname().compareTo(o2.getLastname());
       if (resultOfComparing == 0) {
           resultOfComparing = o1.getFirstname().compareTo(o2.getFirstname());
       }
           return resultOfComparing;

   }*/

    @Override
    public int compare(T  o1, T o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }


    @Override
    public Comparator<T> reversed() {
        return Comparator.super.reversed();
    }
}
