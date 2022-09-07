import model.Food;
import model.Apple;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.COLOUR_GREEN;
import static model.constants.Colour.COLOUR_RED;

public class Main {
    public static void main(String[] args[]) {

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, COLOUR_RED, true);
        Apple greenApple = new Apple(8, 60, COLOUR_GREEN, true);
    }

    Food[] food = new Food[]{meat, redApple, greenApple};
    ShoppingCart shoppingCart = new ShoppingCart(food[]);

System.out.println (ShoppingCart.getSumNoDiscount());
System.out.println (ShoppingCart.getSumDiscount());
System.out.println (ShoppingCart.getSumNoDiscountVegan());

}
