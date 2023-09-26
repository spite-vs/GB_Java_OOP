import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Logger log = new Logger();
        iCalculator cal = new ComCal(log);
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите действительную часть:");
        int material = iScanner.nextInt();
        System.out.println("Введите мнимую часть:");
        int imaginary = iScanner.nextInt();
        ComNum n1 = new ComNum(material, imaginary);

        System.out.print("Введите операцию (+,*,/): ");
        char oper = iScanner.next().charAt(0);

        System.out.println("Введите действительную часть:");
        int material2 = iScanner.nextInt();
        System.out.println("Введите мнимую часть:");
        int imaginary2 = iScanner.nextInt();
        ComNum n2 = new ComNum(material2, imaginary2);

        switch (oper) {
            case '+':
                ComNum sum = cal.sum(n1, n2);
                System.out.println("Сумма: " + sum);
                break;
            case '*':
                ComNum prod = cal.multiply(n1, n2);
                System.out.println("Произведение: " + prod);
                break;
            case '/':
                ComNum quot = cal.divide(n1, n2);
                System.out.println("Частное: " + quot);
                break;
            default:
                System.out.println("Неверная операция");
                break;

        }
    }

}
