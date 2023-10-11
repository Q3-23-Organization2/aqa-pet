package homework6;

public class User {
    public String userName;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String password;
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Sorry, password length must be more than 8 symbols");
        } else {
            this.password = password;
            System.out.println("Password is: " + this.password);
        }
    }
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Sorry, you are must be older than 18 years old");
        } else {
            this.age = age;
            System.out.println("User age is: " + age);
        }

    }

    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   /*public User() {
        System.out.println("Default constructor");*/


    /*public User(String userName) {
        this.userName = userName;
        System.out.println(this.userName);
    }*/

    public User(String userName,String password) {
    this.userName = userName;
    System.out.println("User name is: " + this.userName);
    if (password.length() < 8) {
            System.out.println("Sorry, password length must be more than 8 symbols");
    } else {
            this.password = password;
        System.out.println("Password is: " + this.password);
    }

}

/*

    public boolean isActive;
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }*/




    public int amountSpentMoney;

    public void setAmountSpentMoney(int valueAmountSpentMoney) {
        amountSpentMoney = valueAmountSpentMoney;
    }

    public int getAmountSpentMoney() {
        return amountSpentMoney;
    }

    public void makePurchase(double purchasePrice) {

        amountSpentMoney += purchasePrice;
        System.out.println("User purchase price: " + purchasePrice);

    }

    public void printTotalAmountOfSpentMoney() {

        System.out.println("Total spent money by user: " + amountSpentMoney);

    }


/*    */

    /*



    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    */


    }


