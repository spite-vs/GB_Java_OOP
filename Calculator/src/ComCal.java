
public class ComCal implements iCalculator {
    private Logger log;

    public ComCal(Logger log) {
        this.log = log;
    }

    @Override
    public ComNum add(ComNum n1, ComNum n2) {
        ComNum result = n1.add(n2);
        log.log("Cложение: " + n1 + " + " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComNum multiply(ComNum n1, ComNum n2) {
        ComNum result = n1.multiplication(n2);
        log.log("Умножение: " + n1 + " * " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComNum divide(ComNum n1, ComNum n2) {
        ComNum result = n1.divide(n2);
        log.log("Деление: " + n1 + " / " + n2 + " = " + result);
        return result;
    }
}
