package com.seppana.sportwearshop.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
//Класс Покупатель
public class Buyer {
    private int id;              //первичный ключ
    private String name;
    private String surname;      //фио
    private String login;
    private String password;
    private String city;
    private String country;
    private String telephone;
    private String email;
    private String date;          //дата регистрации
    private String blockAdmin;    //блокировка админом

//    List<int> productList; //список id в таблице historyBuyers (истории заказов)

}
