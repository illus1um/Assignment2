public class Person implements Payable, Comparable<Person> {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;

    public Person() {
        id = id_gen++;
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public String getPosition() {
        return "Student";
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    };

    @Override
    public int compareTo(Person p) {
        if(this.getPaymentAmount() < p.getPaymentAmount())
            return -1;
        else if(this.getPaymentAmount() > p.getPaymentAmount())
            return 1;
        return 0;
    };
}
