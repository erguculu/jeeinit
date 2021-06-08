package com.example.mycommercex;

import com.example.mycommercex.bo.MyProduct;
import com.example.mycommercex.dao.MyProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/auth/basicInsert")
public class InsertSomeProductServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MyProduct myProduct = new MyProduct();
        myProduct.setName("Book");
        myProduct.setContent("Novel");
        myProduct.setPrice(50);

        MyProductDao.addProduct(myProduct);

    }
}