package model;

public class Meat extends Food {
    public Meat(int amount, double price) {
        super(amount, price);
        this.isVegetarian = false; // мясо не вегетарианское
    }

    @Override
    public double getDiscount() {
        return 0; // нет скидки на мясо
    }
}