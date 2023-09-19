package Controllers;

import java.util.List;

import Domen.Person;
import Domen.Teacher;

public class AccountController {
    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    public static <T extends Person> double averageAge(List<T> persons) {
        double sum = 0;
        for (T person : persons) {
            sum += person.getAge();
        }
        return sum / persons.size();
    }

}
