import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group5123 = new StudentGroup(listStud, 5123);
        // System.out.println(group5123);
        // for (Student s : group5123) {
        // System.out.println(s);
        // }
        // System.out.println();

        // Collections.sort(group5123.getGroup());
        // for (Student s : group5123) {
        // System.out.println(s);
        // }

        Student s7 = new Student("Александр", 25);
        Student s8 = new Student("Эмануил", 23);
        Student s9 = new Student("Авдентий", 22);
        Student s10 = new Student("Ипполит", 23);
        Student s11 = new Student("Аластор", 23);
        Student s12 = new Student("Пирог", 23);
        Student s13 = new Student("Адриан", 23);
        Student s14 = new Student("Афродита", 23);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);
        listStud2.add(s13);
        listStud2.add(s14);

        StudentGroup group0001 = new StudentGroup(listStud2, 0001);
        // System.out.println(group0001);

        Student s15 = new Student("Саша", 25);
        Student s16 = new Student("Даша", 23);
        Student s17 = new Student("Лёша", 22);
        Student s18 = new Student("Маша", 23);
        Student s19 = new Student("Каша", 23);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s15);
        listStud3.add(s16);
        listStud3.add(s17);
        listStud3.add(s18);
        listStud3.add(s19);

        StudentGroup group9999 = new StudentGroup(listStud3, 9999);

        Student s20 = new Student("Саша", 25);
        Student s21 = new Student("Даша", 23);
        Student s22 = new Student("Лёша", 22);
        Student s23 = new Student("Маша", 23);
        Student s24 = new Student("Каша", 23);

        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s20);
        listStud4.add(s21);
        listStud4.add(s22);
        listStud4.add(s23);
        listStud4.add(s24);

        StudentGroup group9998 = new StudentGroup(listStud4, 9998);
        // System.out.println(group9999);

        StudentSteam steam1 = new StudentSteam(1);
        steam1.add(group0001);
        steam1.add(group9999);
        steam1.add(group9998);
        steam1.add(group5123);

        System.out.println(steam1);
        Collections.sort(steam1.getGroups());
        System.out.println(steam1);
    }
}
