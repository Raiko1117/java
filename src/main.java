import java.util.Collections;
import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Lennon", "Musician", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Musician", 50000.00);
        Student student1 = new Student("Ringo", "Starr", 2.33);
        Student student2 = new Student("Paul", "McCartney", 3.67);


        ArrayList<Person> people = new ArrayList<Person>();
        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " +person.getPaymentAmount());

        }
    }
}