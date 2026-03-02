import java.util.Objects;

import kz.Person;

public class SameHashCode {
    public static void main(String[] args) {
        // Alice (Age 31)
        int hash1 = Objects.hash("Alice", 31);
        
        // Alicd (Age 62) - 'e' became 'd' (-1 char), Age increased +31
        int hash2 = Objects.hash("Alicd", 62);
        
        // System.out.println("Alice, 31: " + hash1);
        // System.out.println("Alicd, 62: " + hash2);
        // System.out.println("Same bucket? " + (hash1 == hash2)); // True
        
        // //Second example
        Person p1 = new Person("Alice");
        p1.setAge(25);
        Person p2 = new Person("Alicd");
        p2.setAge(26);
        System.out.println(p1.getName() + ", " + p1.getAge()+": "+p1.hashCode());
        System.out.println("Alicd, 26: " + p2.hashCode());

    }
}
