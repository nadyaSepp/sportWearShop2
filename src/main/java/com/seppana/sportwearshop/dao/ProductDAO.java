package com.seppana.sportwearshop.dao;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

}
