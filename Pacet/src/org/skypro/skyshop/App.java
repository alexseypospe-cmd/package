package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args){
        ProductBasket basket = new ProductBasket();

        // Создаём несколько продуктов
        Product a1 = new Product("Яблоко", 50);
        Product a2 = new Product("Хлеб", 30);
        Product a3 = new Product("Молоко", 80);
        Product a4 = new Product("Яйца", 120);
        Product a5 = new Product("Сыр", 200);
        Product a6 = new Product("Вода", 25);

        System.out.println("=== Добавление продуктов в корзину ===");
        basket.addProduct(a1);
        basket.addProduct(a2);
        basket.addProduct(a3);
        basket.addProduct(a4);
        basket.addProduct(a5);

        System.out.println("\n=== Попытка добавить продукт в заполненную корзину ===");
        basket.addProduct(a6);

        System.out.println("\n=== Печать содержимого корзины ===");
        basket.printContents();

        System.out.println("\n=== Получение стоимости корзины ===");
        int totalCost = basket.getTotalCost();
        System.out.println("Общая стоимость: " + totalCost + " руб.");

        System.out.println("\n=== Поиск товара, который есть в корзине ===");
        boolean hasApple = basket.containsProduct("Яблоко");
        System.out.println("Есть ли яблоко в корзине? " + hasApple);

        System.out.println("\n=== Поиск товара, которого нет в корзине ===");
        boolean hasWater = basket.containsProduct("Вода");
        System.out.println("Есть ли вода в корзине? " + hasWater);

        System.out.println("\n=== Очистка корзины ===");
        basket.clear();

        System.out.println("\n=== Печать содержимого пустой корзины ===");
        basket.printContents();

        System.out.println("\n=== Получение стоимости пустой корзины ===");
        int emptyCost = basket.getTotalCost();
        System.out.println("Стоимость пустой корзины: " + emptyCost + " руб.");

        System.out.println("\n=== Поиск товара по имени в пустой корзине ===");
        boolean hasAny = basket.containsProduct("Яблоко");
        System.out.println("Есть ли яблоко в пустой корзине? " + hasAny);
    }


}
