package com.seppana.sportwearshop.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
//Класс Администратор
public class Admin {
    private int id;         //первичный ключ
    private String name;
    private String surname;
    private String login;
    private String password;
    private String date;    //дата регистрации

}
