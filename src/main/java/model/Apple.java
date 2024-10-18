package model;

import static model.constants.Discount.redAppleDiscount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        this.isVegetarian = true; // яблоки вегетарианские
    }

    @Override
    public double getDiscount() {
        if ("Red".equalsIgnoreCase(colour)) {
            return redAppleDiscount; // 60% скидка на красные яблоки
        }
        return 0; // нет скидки на зелёные яблоки
    }
}
