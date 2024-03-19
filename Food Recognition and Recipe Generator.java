import java.util.Scanner;

public class FoodRecognitionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hard-coded food items and their corresponding recipes
        String[] foods = {"pizza", "pasta", "burger"};
        String[] recipes = {
            "Pizza Recipe: Dough, Tomato Sauce, Cheese, Toppings (e.g., pepperoni, mushrooms)",
            "Pasta Recipe: Pasta, Sauce (e.g., marinara, alfredo), Parmesan Cheese",
            "Burger Recipe: Bun, Patty (e.g., beef, veggie), Lettuce, Tomato, Cheese, Sauce (e.g., ketchup, mayo)"
        };

        System.out.println("Enter a food item to recognize and generate a recipe:");
        String foodInput = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < foods.length; i++) {
            if (foodInput.contains(foods[i])) {
                System.out.println("Food recognized: " + foods[i]);
                System.out.println("Recipe: " + recipes[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Food not recognized. Please try again with a different food.");
        }

        scanner.close();
    }
}
