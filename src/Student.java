public class Student implements Comparable<Student>{
    private String firstname;
    private String lastname;
    private int id;
    private int meanBall;


    public  Student (String firstname, String lastname, int id, int meanBall){
        this.firstname=firstname;
        this.lastname=lastname;
        this.id = id;
        this.meanBall=meanBall;
    }

    public double getMeanBall() {
        return meanBall;
    }

    public void setMeanBall(int meanBall) {
        this.meanBall = meanBall;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", meanBall=" + meanBall +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.getMeanBall()-o.getMeanBall());
    }
}
