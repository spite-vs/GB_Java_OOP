package Model.Core;

public class Student extends Person {
    private Long id;
    private static Long generalId = 0L;

    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student: " + super.getName() + "; age: " + super.getAge() + "; ID: " + id;
    }
}
