package homework6;

public class UserValidation {

    public static void main(String[] args) {

    User user = new User("Sergii", "Test12345");
    user.setAmountSpentMoney(40);
    user.makePurchase(30.76);
    user.printTotalAmountOfSpentMoney();


    }
}
