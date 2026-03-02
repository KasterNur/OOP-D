import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import kz.Person;
import week4.obj.animals.Animals;
import week4.obj.animals.Dog;

public class TestHashTable {
    public static void main(String[] args) {
      Map<Person, String> map = new HashMap<>();
              Person p1 = new Person("Alice");
        p1.setAge(25);
        Person p2 = new Person("Alicd");
        p2.setAge(26);

        map.put(p1, "Software Engineer");
        map.put(p2, "Data Scientist");

        // 4. The problem: Both live in the same bucket
            System.out.println("Person 1 Hash: " + p1.hashCode());
        System.out.println("Person 2 Hash: " + p2.hashCode());
        System.out.println("Are they equal? " + p1.equals(p2));

        System.out.println("Map Size: " + map.size()); 
        System.out.println("Value for Alice: " + map.get(p2));
        

    }
}
