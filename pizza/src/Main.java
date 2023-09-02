import pkgPizza.base.Pizza;
import pkgPizza.base.Topping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una pizza
        Pizza pizza = new Pizza("Pizza Especial el ", 100.00);

        // Crear toppings con precios
        Topping tomate = new Topping("Tomate", 15);
        Topping Jamon = new Topping("Jamon", 10);
        Topping Chile = new Topping("Chile", 20);

        List<Topping> availableToppings = new ArrayList<>();
        availableToppings.add(tomate);
        availableToppings.add(Jamon);
        availableToppings.add(Chile);

        // Mostrar menú y agregar toppings
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nElije un ingrediente (Numeros del 1 al 3):");
            System.out.println("\nMenú de Ingredientes:");
            for (int i = 0; i < availableToppings.size(); i++) {
                Topping topping = availableToppings.get(i);
                System.out.println((i + 1) + ". " + topping.getName() + " - $" + topping.getPrice());
            }

            System.out.print("Elige un topping para agregar (0 para terminar): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice > 0 && choice <= availableToppings.size()) {
                Topping selectedTopping = availableToppings.get(choice - 1);
                pizza.addTopping(selectedTopping);
                System.out.println("Topping agregado: " + selectedTopping.getName());
            } else {
                System.out.println("Opción inválida.");
            }
        }

        // Mostrar información final de la pizza
        System.out.println("\nPizza realizada:");
        System.out.println(pizza);
    }
}
