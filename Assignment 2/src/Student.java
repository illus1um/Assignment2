public class Student extends Person {
    private double gpa;
    private static final double STIPEND = 36660;

    public Student() {}

    public  Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        if(gpa > 2.67) return STIPEND;
        else return 0;
    }
}
