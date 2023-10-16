package homework7.Calculiator;

public class Programer extends Calculiator {

    private int value1;
    private int value2;
    private int plus;
    private int minus;
    private int divide;
    private int multi;
    private double log;
    private double logPlus;

    public void setValue1(int enterValue1) {
        this.value1 = enterValue1;
    }

    public void setValue2(int enterValue2) {
        this.value2 = enterValue2;
    }
    @Override
    public void operationPlus() {
        plus = value1 + value2;
        System.out.println("Programer Value1 + Value2 = " + plus);
    }
    @Override
    public void operationMinus() {
        minus = value1 - value2;
        System.out.println("Programer Value1 - Value2 = " + minus);
    }
    @Override
    public void operationDivide() {
        divide = value1 / value2;
        System.out.println("Programer Value1 / Value2 = " + divide);
    }

    @Override
    public void operationMultiple() {
        multi = value1 * value2;
        System.out.println("Programer Value1 * Value2 = " + multi);
    }

    public void mathLog() {
        log = Math.log10(value1);
        System.out.println("Logarithm of Value1 is: " + log);

    }

    public void mathLogOfPlusOperation() {
        logPlus = Math.log10(plus);
        System.out.println("Logarithm of Plus Operation is: " + logPlus);
    }



}
