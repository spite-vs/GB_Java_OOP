package View;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

public class ViewClass implements iGetView {
    private HashMap<String, String> lang = new HashMap<>();

    public ViewClass() {
        this.lang.put("langInput", "Введите команду");
        this.lang.put("langExit", "Выход из программы");
        this.lang.put("emptyList", "Список студентов пуст");
        this.lang.put("IdInput", "Введите ID Студента");
        this.lang.put("delError", "Студента с таким ID нет");
        this.lang.put("delMessage", "удален из списка");
    }

    public HashMap<String, String> getLang() {
        return lang;
    }

    public void printAllStudent(HashMap<Long, Student> students) {
        System.out.println("----------- Список студентов -----------");
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
