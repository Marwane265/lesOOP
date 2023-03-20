package be.intecbrussel.oop;

//package
//import statements
//class


public class Coffee {


    //public is hier de access modifier
    //class => dat het een class is
    // In PascalCase hebben we de class naam.


    //acces modifiers
    //public => is overal in het project
    //default => alleen in de package
    //protected => in de package en sub classen
    //private => is alleen in de klas


    // properties => variabelen
    private String coffeeType;
    private int temperature;

    //constructors => Elke klas heeft een default constructor. Tenzij je er een aanmaakt
    //3 vesrschillende constructors heet constructor overloading

    //no-args constructor
    public Coffee() {
        System.out.println("Coffee created");
    }


    public Coffee(String coffeeType) {
        this.coffeeType = coffeeType;
        System.out.println("Coffee created");
    }

    //all-args constructor

    public Coffee(String coffeeType, int temperature) {
        this.temperature = temperature;
        this.coffeeType = coffeeType;
        System.out.println("Coffee created");
    }


    //Getter and setters
    public String getCoffeeType() {
        return coffeeType;
    }


    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }


    public int getTemperature() {
        return temperature;
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


}
