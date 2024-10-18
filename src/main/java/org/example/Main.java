package org.example;

import model.*;
import model.constants.*;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        Meat meat = new Meat(5, 100); // 5 кг по 100 рублей
        Apple redApple = new Apple(10, 50, Colour.red); // 10 кг красных яблок по 50 рублей
        Apple greenApple = new Apple(8, 60, Colour.green); // 8 кг зелёных яблок по 60 рублей

        // Создание массива продуктов
        Food[] products = {meat, redApple, greenApple};

        // Инициализация корзины
        ShoppingCart cart = new ShoppingCart(products);

        // Вывод значений
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPriceWithoutDiscount());
    }
}