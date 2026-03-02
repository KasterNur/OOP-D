import java.util.HashSet;
import java.util.Set;

import kz.Person;





public class TestHashInSet {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        Person p1 = new Person("Alice", 25); // Hash: 63350326
        Person p2 = new Person("Alice", 25); // Hash: 63350326

        System.out.println("--- Adding Alice ---");
        set.add(p1);

        System.out.println("\n--- Adding Alicd ---");
        set.add(p2);
        System.out.println("p1=" + set.contains(p1));
        System.out.println("p2=" + set.contains(p2));
        System.out.println("\nSet size: " + set.size());
    }
}
