package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassList;
import Model.Core.Student;
import View.ViewClass;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private HashMap<Long, Student> students = new HashMap<>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testDate(HashMap<Long, Student> studs) {
        if (studs.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        // view.printAllStudent(model.getStudents());
        students = model.getStudents();
        if (testDate(students)) {
            view.printAllStudent(students);
        } else {
            System.out.println(view.getLang().get("emptyList"));
        }
    }

    Scanner sc = new Scanner(System.in);

    public void run() {
        Command com = Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String command = view.prompt(view.getLang().get("langInput"));
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println(view.getLang().get("langExit"));
                    break;
                case LIST:
                    view.printAllStudent(model.getStudents());
                    break;
                case DELETE:
                    System.out.println(view.getLang().get("IdInput"));
                    Long id = sc.nextLong();
                    if (model.getStudents().containsKey(id)) {
                        System.out.println(model.getStudents().get(id) + " - " + view.getLang().get("delMessage"));
                        model.getStudents().remove(id);
                    } else {
                        System.out.println(view.getLang().get("delError"));
                    }
            }
        }
    }
}
