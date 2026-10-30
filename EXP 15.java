
import java.io.*;

class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int rollNo;
    String name;
    double cgpa;

    Student(int r, String n, double c) {
        rollNo = r;
        name = n;
        cgpa = c;
    }

    void display() {
        System.out.println("Student Details");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {

        Student student = new Student(101, "Rahul", 8.75);

        try {
            // Serialization
            FileOutputStream fos =
                new FileOutputStream("student.ser");

            ObjectOutputStream oos =
                new ObjectOutputStream(fos);

            oos.writeObject(student);
            oos.close();

            System.out.println("Object Serialized Successfully.");

            // Deserialization
            FileInputStream fis =
                new FileInputStream("student.ser");

            ObjectInputStream ois =
                new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            ois.close();

            System.out.println("Object Deserialized Successfully.");

            s.display();

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found: " + e.getMessage());
        }
    }
}
