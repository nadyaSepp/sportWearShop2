package com.seppana.sportwearshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Дипломная работа.
//Тема: Web-магазин спортивной одежды

//Создать веб-магазин спортивной одежды.
//Веб-магазин должен состоять из административной и пользовательской части.

//Пользовательская часть предоставляет пользователю следующие возможности:
//регистрация пользователя (необязательна для покупки товаров), просмотр това-
//ров, покупка товара (обязательно реализовать корзину заказа), поиск товаров по
//заданным параметрам (название, бренд, цена, категория товара, размер, цвет).
// У покупателя есть кабинет покупателя, которые хранит информацию о покупателе
//(ФИО, город, страна, контактный телефон, email), историю заказов. Пользователь
//может менять любую информацию в своем кабинете, кроме истории заказов.

//Административная часть позволяет:,
// добавлять/удалять/изменять товары и информацию о них,
// добавлять/удалять/изменять категории товаров,
// просматривать информацию о пользователях, блокировать или удалять пользователей.
@SpringBootApplication
public class SportWearShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportWearShopApplication.class, args);
    }

}
