package model;


public abstract class Food implements Discountable {


    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    public double getDiscount;

    //конструктор
    public Food (int amount, double price) {
        this.amount=getAmount();
        this.price=getPrice();
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
