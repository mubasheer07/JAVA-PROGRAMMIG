import java.util.ArrayList;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class FilterStudents {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 85));
        students.add(new Student("Priya", 55));
        students.add(new Student("Amit", 72));
        students.add(new Student("Sneha", 48));
        students.add(new Student("Kiran", 90));

        System.out.println("Students with marks greater than 60:");

        for (Student s : students) {
            if (s.marks > 60) {
                System.out.println(s.name + " - " + s.marks);
            }
        }
    }
}