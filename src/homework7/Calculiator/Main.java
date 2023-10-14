package homework7.Calculiator;

public class Main {

    public static void main(String[] args) {

        Calculiator calculiator = new Calculiator();
        calculiator.operationPlus();
        System.out.println("    ");

        Engineer engineer = new Engineer();
        engineer.setValue1(20);
        engineer.setValue2(10);
        engineer.operationPlus();
        engineer.operationMinus();
        engineer.operationDivide();
        engineer.operationMultiple();
        engineer.mathSquare();
        engineer.mathSquareOfPlusOperation();
        System.out.println("    ");

        Programer programer = new Programer();
        programer.setValue1(17);
        programer.setValue2(8);
        programer.operationMinus();
        programer.operationPlus();
        programer.operationDivide();
        programer.operationMultiple();
        programer.mathLog();
        programer.mathLogOfPlusOperation();


    }

}
