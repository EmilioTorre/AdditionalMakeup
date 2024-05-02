package Chapter7;
/**
 * 4.11.1
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * 7.12.1. Create the Student Class
 * Create a simple class named student with the following properties:
 * id
 * age
 * gpa
 * credit hours accomplished
 * Also, create the following methods:
 * Constructors
 * Getters and setters
 * 7.12.2. Create the equals() and toString() method for the Student Class
 * Two students objects are considered equal if their id is the same. The toString() method should print out the name and id of the object.
 */
public class Student {
    private int id;
    private int age;
    private double gpa;
    private int creditHoursAccomplished;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCreditHoursAccomplished() {
        return creditHoursAccomplished;
    }

    public void setCreditHoursAccomplished(int creditHoursAccomplished) {
        this.creditHoursAccomplished = creditHoursAccomplished;
    }

    public Student(int id, int age, double gpa, int creditHoursAccomplished) {
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        this.creditHoursAccomplished = creditHoursAccomplished;
    }

    // Getters and setters (omitted for brevity)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", gpa=" + gpa +
                ", creditHoursAccomplished=" + creditHoursAccomplished +
                '}';
    }
}