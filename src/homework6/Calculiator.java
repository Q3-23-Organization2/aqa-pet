package homework6;

public class Calculiator {

    public int value1;

    public void setValue1(int enterValue1) {
        value1 = enterValue1;
    }

    public int value2;

    public void setValue2(int enterValue2) {
        value2 = enterValue2;
    }
    public int plus;

    public void operationPlus() {
        plus = value1 + value2;
        System.out.println("Value1 + Value2 = " + plus);
    }
    public int minus;

    public void operationMinus() {
        minus = value1 - value2;
        System.out.println("Value1 - Value2 = " + minus);
    }

    public int divide;

    public void operationDivide() {
        divide = value1 / value2;
        System.out.println("Value1 / Value2 = " + divide);
    }
    public int multi;

    public void operationMultiple() {
        multi = value1 * value2;
        System.out.println("Value1 * Value2 = " + multi);
    }


}
