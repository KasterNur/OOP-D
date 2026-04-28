package week15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleStream {

    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Jack", "Jill");
// List<String> filtered = new ArrayList<>();

// for (String name : names) {
//     if (name.startsWith("A")) {
//         filtered.add(name);
//     }
// }

// List<String> upper = new ArrayList<>();
// for (String name : filtered) {
//     upper.add(name.toUpperCase());
// }

// Collections.sort(upper);

// for (int i = 0; i < Math.min(3, upper.size()); i++) {
//     System.out.println(upper.get(i));
// }

names.stream().filter(name->name.startsWith("A")).map(String::toUpperCase)
        .sorted()
        .limit(3)
        .forEach(System.out::println);


}
}
