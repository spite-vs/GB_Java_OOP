package Domen;

public class Teacher extends Person {
    private String acadDegree;

    public Teacher(String name, int age, String acadDegree) {
        super(name, age);
        this.acadDegree = acadDegree;
    }

    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
    public String toString() {
        return super.toString() + "; acadDegree: " + acadDegree;
    }
}
