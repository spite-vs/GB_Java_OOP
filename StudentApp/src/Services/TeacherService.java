package Services;

import Domen.PersonComparator;
import Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher t = new Teacher(name, age, "Docent");
        count++;
        teachers.add(t);
    }

    public void sortByFIO() {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }

    public void printSort() {
        sortByFIO();
        for (Teacher t : this.teachers) {
            System.out.println(t);
        }
    }
}