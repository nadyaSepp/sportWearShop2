package com.seppana.sportwearshop.controllers;

import com.seppana.sportwearshop.dao.ProductDAO;
import com.seppana.sportwearshop.models.Product;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;                     //Для Model импоритируем
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Здесь описываем контроллер, который манипулирует сущностью Product с помощью CRUD операций
@Controller
@RequestMapping("/products") //помечаем, что вся наша логика начинается с данного префикса, чтоб его не повторять везде
public class ProductsController {
    @Autowired //искать во всех классах приложения
    private ProductDAO productDAO;

}
