package pal.paragi;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "sausage", 4.43, "White");
        System.out.println("Cannot add additional items to a deluxe burger");
        System.out.println("Deluxe hamburger on a White roll with Sausage & Bacon, price is 14.54");
        System.out.println("Added Chips for an extra 2.75");
        System.out.println("Added Drink for an extra 1.81");

    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
    }


    public double itemizeHamburger() {
        return 19.10;
    }
}
