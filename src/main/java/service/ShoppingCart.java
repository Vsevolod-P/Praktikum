package service;
import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total = total + item.getTotalPrice();
        }
        return total;
    }
     public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.getDiscount() != 0) {
                total = total + item.getTotalPrice() *  (1 - ((Discountable) item).getDiscount()/100);
            }  else {
                total = total + item.getTotalPrice();
            }
        }
        return total;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total = total + item.getTotalPrice();
            }
        }
        return total;
    }

}
