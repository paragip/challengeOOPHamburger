package pal.paragi;

public class Hamburger {
    private String name;
    private double price;
    private String breadRollType;
    private String meat;
    private String addition1Name;
    private String addition2Name;
    private double addition1Price;
    private double addition2Price;
    private String addition3Name;
    private String addition4Name;
    private double addition3Price;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = meat;
        System.out.println(name + " hamburger on a " + breadRollType + " with " + meat + ", price is " + price);
    }



   public void addHamburgerAddition1 (String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
        this.price += price;
    }

    public void addHamburgerAddition2 (String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added " + name + " for an extra " + price);
        this.price += price;
    }

    public void addHamburgerAddition3 (String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added " + name + " for an extra " + price);
        this.price += price;
    }

    public void addHamburgerAddition4 (String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added " + name + " for an extra " + price);
        this.price += price;
    }

    public double itemizeHamburger () {
        double hamburgerPrice = this.price;
        return hamburgerPrice;
    }


}
