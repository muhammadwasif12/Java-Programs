public class DetailStudent {

    String firstname;
    String lastname;
    String Section;
    int rollno;
    String teacher;
    String subject;
    int semester;

    // Regular constructor
    DetailStudent(String f, String l, String sec, int r, String sub, int sem, String t) {
        firstname = f;
        lastname = l;
        Section = sec;
        rollno = r;
        subject = sub;
        semester = sem;
        teacher = t;
    }

    // Copy constructor
    DetailStudent(DetailStudent Original) {
        firstname = Original.firstname; // Correct way to access original values
        lastname = Original.lastname;
        Section = Original.Section;
        rollno = Original.rollno;
        subject = Original.subject;
        semester = Original.semester;
        teacher = Original.teacher;
    }

    void displayStudent() {
        System.out.println("The name of Student is: " + firstname + " " + lastname);
        System.out.println("Section: " + Section);
        System.out.println("Roll No: " + rollno);
        System.out.println("Subject: " + subject);
        System.out.println("Semester: " + semester);
        System.out.println("Teacher Name: " + teacher);
        System.out.println("");
        System.out.println("");
    }

    public static void main(String[] args) {
        DetailStudent s1 = new DetailStudent("Wasif", "Shah", "A", 63, "OOP", 3, "Sir Hamza");
        s1.displayStudent();

        // Using copy constructor to copy details from s1 to s2
        DetailStudent s2 = new DetailStudent(s1);
        s2.firstname = "Ali";
        s2.lastname = "Khan";
        s2.Section = "B";
        s2.rollno = 34;
        s2.semester = 4;
        s2.displayStudent();
    }
}
