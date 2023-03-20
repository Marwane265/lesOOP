package be.intecbrussel.oop;

public class MainCoffeeApp {
    public static void main(String[] args) {

        //class    naam van object    = new creer een nieuw object met deze constructor

        Coffee coffee = new Coffee("Black coffee");
        Coffee coffee1 = new Coffee("Arabic coffee");
        Coffee coffee2 = new Coffee("");
        Coffee coffee3 = new Coffee("Colombian Coffee", 80);


        System.out.println(coffee.getCoffeeType());
        System.out.println(coffee1.getCoffeeType());
    }
}
