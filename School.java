package Chapter7;
/**
 * 4.11.1
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *7.12.3. Create the School Class
 *
 * Create a class called School that holds an ArrayList of students. Create the following methods for the class.
 *
 * Constructor
 * void addStudent(Student)
 * void removeStudent(Student)
 * Student findYoungestStudent()
 * Student findOldestStudent()
 * */
import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student findYoungestStudent() {
        if (students.isEmpty()) {
            return null; // No students in the school
        }

        Student youngest = students.get(0);
        for (Student s : students) {
            if (s.getAge() < youngest.getAge()) {
                youngest = s;
            }
        }
        return youngest;
    }

    public Student findOldestStudent() {
        if (students.isEmpty()) {
            return null; // No students in the school
        }

        Student oldest = students.get(0);
        for (Student s : students) {
            if (s.getAge() > oldest.getAge()) {
                oldest = s;
            }
        }
        return oldest;
    }

    public static void main(String[] args) {
        // Example usage:
        School school = new School();
        school.addStudent(new Student(1, 20, 3.8, 60));
        school.addStudent(new Student(2, 22, 3.5, 45));

        System.out.println("Youngest student: " + school.findYoungestStudent());
        System.out.println("Oldest student: " + school.findOldestStudent());
    }
}