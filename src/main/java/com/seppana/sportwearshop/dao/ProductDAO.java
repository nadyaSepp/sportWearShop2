package com.seppana.sportwearshop.dao;

import com.seppana.sportwearshop.models.Product;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component                     //значит будет создаваться bean
//здесь вся работа с базой по товарам
public class ProductDAO {
    private static Connection connection;

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:D:\\shcool_Java\\18_Diplom\\sportWearShop\\database.db");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //Вернуть список товаров
    //READ
    public List<Product> allProducts() {
        List<Product> products = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Products";
            ResultSet set = statement.executeQuery(query);
            while(set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String brand = set.getString("author");
                double price = set.getDouble("price");
                String category = set.getString("genre");
                int size = set.getInt("size");
                String color = set.getString("color");

                products.add(new Product(id,name,brand,price,category,size,color));
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return products;
    }




}
