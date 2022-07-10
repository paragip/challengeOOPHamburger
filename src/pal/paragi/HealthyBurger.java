package pal.paragi;

public class HealthyBurger extends Hamburger{
    private double healthyExtra1Price;
    private String healthyExtra1Name;
    private double healthyExtra2Price;
    private String healthyExtra2Name;
    private double priceHealthyAdded;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");

    }


    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        super.addHamburgerAddition1(addition1Name, addition1Price);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        super.addHamburgerAddition2(addition2Name, addition2Price);
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        super.addHamburgerAddition3(addition3Name, addition3Price);
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        super.addHamburgerAddition4(addition4Name, addition4Price);

    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
         priceHealthyAdded += price;
    }
    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + name + " for an extra " + price);
        priceHealthyAdded += price;
    }

    @Override
    public double itemizeHamburger() {
        return priceHealthyAdded + super.itemizeHamburger();
    }
}
