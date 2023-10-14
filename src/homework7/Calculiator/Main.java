package homework7.Calculiator;

public class Main {

    public static void main(String[] args) {

        Calculiator calculiator = new Calculiator();
        calculiator.operationPlus();
        System.out.println("    ");

        Engineer engineer = new Engineer();
        engineer.setValue1(15);
        engineer.setValue2(10);
        engineer.operationPlus();
        engineer.mathSquare();
        engineer.mathSquareOfPlusOperation();
        System.out.println("    ");



    }

}
