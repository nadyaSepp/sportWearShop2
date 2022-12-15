package com.seppana.sportwearshop.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
//Класс Покупатель
public class Buyer {
    private int id;         //первичный ключ
    private String name;
    private String surname;  //фио
    private String login;
    private String password;
    private String block;    //блокировка
    private String date;     //дата регистрации
//    List<int> productList; //список id в таблице historyBuyers (истории заказов)

}
