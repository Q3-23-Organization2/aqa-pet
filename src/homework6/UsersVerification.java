package homework6;

public class UsersVerification {

    public static void main(String[] args) {

        User user = new User("Andrii", "1qaz@WSX");
        user.setAmountSpentMoney(150);
        user.makePurchase(69.99);
        user.printTotalAmountOfSpentMoney();

        user = new User("Maria", "Mashabest");
        user.setAmountSpentMoney(14560);
        user.makePurchase(229.09);
        user.printTotalAmountOfSpentMoney();

        user = new User("Stepan", "StepbyStep");
        user.setAmountSpentMoney(860);
        user.makePurchase(1584.09);
        user.printTotalAmountOfSpentMoney();

        user = new User("Oleg", "Ole");
        user.setAmountSpentMoney(760);
        user.makePurchase(2.99);
        user.printTotalAmountOfSpentMoney();

    }
}
