package Controller.Interfaces;

import java.util.HashMap;
import java.util.List;

import Model.Core.Student;

public interface iGetModel {
    HashMap<Long, Student> getStudents();
}
