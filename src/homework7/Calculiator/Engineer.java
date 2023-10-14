package homework7.Calculiator;

public class Engineer extends Calculiator {
    private int value1;
    private int value2;
    private double plus;
    private int minus;
    private int divide;
    private int multi;
    private double square;
    private double squarePlus;

    public void setValue1(int enterValue1) {
        this.value1 = enterValue1;
    }

    public void setValue2(int enterValue2) {
        this.value2 = enterValue2;
    }
    @Override
    public void operationPlus() {
        plus = value1 + value2;
        System.out.println("Value1 + Value2 = " + plus);
    }
    @Override
    public void operationMinus() {
        minus = value1 - value2;
        System.out.println("Engineer Value1 - Value2 = " + minus);
    }
    @Override
    public void operationDivide() {
        divide = value1 / value2;
        System.out.println("Engineer Value1 / Value2 = " + divide);
    }

    @Override
    public void operationMultiple() {
        multi = value1 * value2;
        System.out.println("Engineer Value1 * Value2 = " + multi);
    }

    public void mathSquare() {
        square = Math.sqrt(value1);
        System.out.println("Math Square of Value1 is: " + square);

    }

    public void mathSquareOfPlusOperation() {
        squarePlus = Math.sqrt(plus);
        System.out.println("Math Square of Plus Operation is: " + squarePlus);
    }


}
