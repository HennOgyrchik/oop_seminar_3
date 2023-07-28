public class Student extends User implements Comparable<Student>, Printable<Student>{

    private int meanBall;

    public  Student (String firstname, String lastname, int id, int meanBall){
        super(firstname,lastname,id);
        this.meanBall=meanBall;
    }

    public double getMeanBall() {
        return meanBall;
    }

    public void setMeanBall(int meanBall) {
        this.meanBall = meanBall;
    }


    @Override
    public int compareTo(Student o) {
        return (int)(this.getMeanBall()-o.getMeanBall());
    }

    @Override
    public void print() {
        System.out.println(super.toString()+" mean ball= "+meanBall);
    }
}
