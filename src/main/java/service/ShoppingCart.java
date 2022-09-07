package service;


import model.Discountable;
import model.Food;
import model.Apple;

import static model.constants.Colour.COLOUR_GREEN;
import static model.constants.Colour.COLOUR_RED;


public class ShoppingCart implements Discountable {
    Food[] food;


    public double getSumNoDiscount() {
        double  getSumNoDiscount= 0;
        for (int i = 0; i < food.length; i++ ) {
            getSumNoDiscount += food[i].getAmount()*food[i].getPrice();
        }
        return getSumNoDiscount;

    }

    public double getSumDiscount(){
        double getSumDiscount = 0;
        for (int i = 0; i < food.length; i++ ) {
            if (food[i].getColour() == COLOUR_RED )
                getSumDiscount += food[i].getAmount() * food[i].getPrice() * food[i].getDiscount;
        }
        return getSumDiscount;
    }

    public double getSumNoDiscountVegan() {
        double getSumNoDiscountVegan = 0;
        for (int i = 0; i < food.length; i++ ) {
            if (food[i].getColour() == COLOUR_RED || food[i].getColour() == COLOUR_GREEN) {
                getSumNoDiscountVegan += food[i].getAmount()*food[i].getPrice();
            }
        }
        return getSumNoDiscountVegan;

    }
}
