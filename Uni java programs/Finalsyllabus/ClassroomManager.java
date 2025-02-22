import java.util.ArrayList;

class Classroom {
    private ArrayList<String> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(name);
        System.out.println(name + " added to the classroom.");
    }

    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println(name + " removed from the classroom.");
        } else {
            System.out.println(name + " not found in the classroom.");
        }
    }

    public boolean hasStudent(String name) {
        return students.contains(name);
    }

    public void listStudents() {
        System.out.println("Students in the classroom:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}

public class ClassroomManager {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        // Adding students
        classroom.addStudent("Alice");
        classroom.addStudent("Bob");
        classroom.addStudent("Charlie");

        // Removing a student
        classroom.removeStudent("Bob");

        // Checking if a student exists
        System.out.println("Is Alice in the classroom? " + classroom.hasStudent("Alice"));

        // Listing all students
        classroom.listStudents();
    }
}
