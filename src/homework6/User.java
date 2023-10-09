package homework6;

import java.util.Scanner;

public class User {
public String userName;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Sorry, you are must be older than 18 years old");
        }
        else {
            this.age = age;
        }

    }

    public String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Sorry, password length must be more than 8 symbols");
        }
        else {
            this.password = password;
        }
    }

   double amountSpentMoney = 0;
   public boolean isActive() {
       return amountSpentMoney > 0;
   }

    public void makePurchase() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter user purchase price: ");
        double purchasePrice = scan.nextDouble();

        if (purchasePrice > 0) {
            double amountSpentMoney += purchasePrice;
            System.out.println("Total user purchase is: " + amountSpentMoney);
        }






    }
}
