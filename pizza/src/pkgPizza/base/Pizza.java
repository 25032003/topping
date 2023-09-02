package pkgPizza.base;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<pkgPizza.base.Topping> toppings = new ArrayList<>();

    // Constructor
    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getters and setters

    // Método para agregar un ingrediente a la pizza
    public void addTopping(pkgPizza.base.Topping topping) {
        toppings.add(topping);
        price += topping.getPrice();  // Sumar el precio del topping al precio total de la pizza
    }

    // Método para mostrar los toppings de la pizza
    public void mostrarToppings() {
        System.out.println("Toppings de la pizza " + name + ":");
        for (pkgPizza.base.Topping topping : toppings) {
            System.out.println(topping);
        }
    }

    @Override
    public String toString() {
        return "Pizza: {" + name + ", Precio=" + price + "}";
    }

    public double getPrice() {
        return 0;
    }

    public Topping[] getToppings() {
        return new Topping[0];
    }



}