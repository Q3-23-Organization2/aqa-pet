package homework6;

public class Main {

    public static void main(String[] args) {

    User user = new User("Sergii", "Test12345");
    user.setAmountSpentMoney(40);
    user.makePurchase(30);
    user.printTotalAmountOfSpentMoney();


    }
}
