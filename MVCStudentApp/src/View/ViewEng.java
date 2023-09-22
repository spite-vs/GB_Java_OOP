package View;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

public class ViewEng implements iGetView {
    private HashMap<String, String> lang = new HashMap<>();

    public ViewEng() {
        this.lang.put("langInput", "Enter command: ");
        this.lang.put("langExit", "EXIT");
        this.lang.put("emptyList", "empty list");
        this.lang.put("IdInput", "input student ID");
        this.lang.put("delError", "There is no student with this ID");
        this.lang.put("delMessage", "deleted from list");
    }

    public HashMap<String, String> getLang() {
        return lang;
    }

    public void printAllStudent(HashMap<Long, Student> students) {
        System.out.println("----------- Student list -----------");
        for (Student s : students.values()) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}