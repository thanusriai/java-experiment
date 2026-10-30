
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // List
        List<String> list = new ArrayList<>();

        list.add("Arun");
        list.add("Divya");
        list.add("Karthik");
        list.add("Divya");

        System.out.println("Student List");
        System.out.println(list);

        // Set
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");
        set.add("C++");

        System.out.println("Course Set");
        System.out.println(set);

        // Map
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Arun");
        map.put(102, "Divya");
        map.put(103, "Karthik");

        System.out.println("Student Map");

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // Queue
        Queue<String> q = new LinkedList<>();

        q.offer("Student-1");
        q.offer("Student-2");
        q.offer("Student-3");

        System.out.println("Queue Before Processing");
        System.out.println(q);

        System.out.println("Processing: " + q.poll());

        System.out.println("Queue After Processing");
        System.out.println(q);
    }
}
