package advanced.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        // Stream Creation

        String[] names = {"Ana", "Maria", "Elena"};
        Stream<String> stream1 = Arrays.stream(names);
        stream1.forEach(s -> System.out.println(s));

        Stream<String> stream2 = Stream.of("Iosif", "Andrei", "Iulian");

        // Iteration

        Boolean isStartingWithI = stream2.anyMatch(s -> s.startsWith("I"));
        System.out.println(isStartingWithI);
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList(names));
        System.out.println(names2.stream().anyMatch(s -> s.length() > 5));

        // Filtering

        List<String> namesWithD = names2.stream().filter(s -> s.contains("i")).collect(Collectors.toList());
        System.out.println(namesWithD);

        // mapping

        List<Integer> namesLength = names2.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(namesLength);

        List<String> namesConcatenate = names2.stream().map(s -> s + " are mere").collect(Collectors.toList());
        System.out.println(namesConcatenate);

        // Reduction

        int length = namesLength.stream().reduce(0, (x,y) -> x+y);
        System.out.println(length);

        int length1 = namesLength.stream().reduce(1, Integer::sum);
        System.out.println(length1);

        int length2 = namesLength.stream().reduce(1, Integer::max);
        System.out.println(length2);

        int lengthSum = names2.stream().collect(Collectors.summingInt(s -> s.length()));
        System.out.println(lengthSum);

        // method reference - with lambda
        List<String> namesToUpperCase = names2.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(namesToUpperCase);
        // method reference - with method
        List<String> namesToUpperCase2 = names2.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(namesToUpperCase2);

    }
}
