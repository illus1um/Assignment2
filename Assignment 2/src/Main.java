import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Lennon", "Lecturer", 40000);
        Employee employee2 = new Employee("Jane", "Shepard", "Rector", 2000000);
        Student student1 = new Student("Ringo", "Starr", 2.57);
        Student student2 = new Student("George", "Harrison", 3.99);

        ArrayList<Person> people = new ArrayList<>();

        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person: people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge.");
        }
    }
}