package com.seppana.sportwearshop.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
//Класс Товар, описываемый параметрами (название, бренд, цена, категория товара, размер, цвет)
public class Product {
   private int id; //первичный ключ
    @NotEmpty(message = "Название товара не может быть пустым!")
    @Size(min = 2, max = 100, message = "Название товара должно быть длиной от 2 до 100 символов!")
    @Pattern(regexp="[А-Яа-я\\s]+", message = "Название товара должно состоять только из русских букв!")
    private String name;
    private String brand;
    private double price;
    private String category;
    private int size;
    private String color;

   private Product(int id,String name, String brand,double price, String category, int size, String color){
        this.id=id;
        this.name=name;
        this.brand=brand;
        this.price=price;
        this.category=category;
        this.size=size;
        this.color=color;
   }

   //вставили зависимость Lombok - поэтому не генерим метoды Set, Get, ToString

}
