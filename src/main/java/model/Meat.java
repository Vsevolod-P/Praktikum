package model;

public class Meat extends Food{
    public void Meats(int amount, double price){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }
}
