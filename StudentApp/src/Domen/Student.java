package Domen;

public class Student extends Person implements Comparable<Student> {
    private int id;
    private static int generalId;

    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person: " + super.getName() + "; age: " + super.getAge() + "; ID: " + id;
    }

    @Override
    public int compareTo(Student o) {
        // System.out.println(super.getName() + " <-> " + o.getName());
        if (super.getAge() == o.getAge()) {
            return 0;
        } else if (super.getAge() > o.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }

}
