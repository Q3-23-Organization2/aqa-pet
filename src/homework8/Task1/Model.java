package homework8.Task1;

public class Model extends MobilePhone {

    protected String type;

    protected int memory;

    protected String country;

    protected int price;

    public void setType(String type) {
        this.type = type;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void typeOfPhone() {
        System.out.println(type);
    }

    @Override
    public void memoryOfPhone() {
        System.out.println(memory);

    }

    @Override
    public void countryOfPhone() {
        System.out.println(country);
    }

    public void priceOfPhone() {
        price = memory * 3500;
        System.out.println("Price of your Phone is: " + price);
    }

    @Override
    public void companyName() {
        System.out.println("Apple");
    }

}
