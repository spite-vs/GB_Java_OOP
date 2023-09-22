package Model;

import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

public class ModelClassHash implements iGetModel {

    private HashMap<Long, Student> students;

    public ModelClassHash(HashMap<Long, Student> students) {
        this.students = students;
    }

    @Override
    public HashMap<Long, Student> getStudents() {
        return students;
    }
}
