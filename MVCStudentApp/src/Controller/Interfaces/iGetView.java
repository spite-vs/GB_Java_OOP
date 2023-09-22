package Controller.Interfaces;

import java.util.HashMap;
import java.util.List;

import Model.Core.Student;

public interface iGetView {

    void printAllStudent(HashMap<Long, Student> students);

    String prompt(String msg);

    public HashMap<String, String> getLang();
}
