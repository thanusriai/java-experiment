
import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Sort by roll number
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    public String toString() {
        return rollNo + " - " + name;
    }
}

// Sort by name
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(103, "Rahul"));
        list.add(new Student(101, "Anitha"));
        list.add(new Student(102, "Karthik"));

        System.out.println("Before Sorting");
        for (Student s : list)
            System.out.println(s);

        // Comparable
        Collections.sort(list);

        System.out.println("Sorted by Roll Number");
        for (Student s : list)
            System.out.println(s);

        // Comparator
        Collections.sort(list, new NameComparator());

        System.out.println("Sorted by Name");
        for (Student s : list)
            System.out.println(s);
    }
}
