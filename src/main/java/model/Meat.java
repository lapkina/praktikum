package model;

public class Meat extends Food implements Discountable{

    public Meat(int amount, double price) {
        super(amount, price);

    }

    public boolean isVegetarian() {
        return true;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
