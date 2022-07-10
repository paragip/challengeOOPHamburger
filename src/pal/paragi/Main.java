package pal.paragi;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "sousage", 3.56, "white");
        hamburger.addHamburgerAddition1("Tomato", 2);
        hamburger.addHamburgerAddition2("Salad", 1);
        hamburger.addHamburgerAddition3("Ketchup", 0.5);
        hamburger.addHamburgerAddition4("Butter", 1);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("proba", 11);
        System.out.println("Total Deluxe Burger price is " + deluxeBurger.itemizeHamburger());

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("duck", 6.01);
        healthyBurger.addHealthyAddition1("akármi", 2.01);
        healthyBurger.addHealthyAddition2("akármi", 0.01);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());


    }




}
