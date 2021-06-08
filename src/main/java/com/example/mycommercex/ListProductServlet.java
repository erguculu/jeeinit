package com.example.mycommercex;

import com.example.mycommercex.bo.MyProduct;
import com.example.mycommercex.dao.MyProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/listProduct")
public class ListProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<MyProduct> products = MyProductDao.getAllProducts();

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ListProductServlet</title>");
        out.println("</head>");
        out.println("<body>");
        products.stream().forEach(p->out.println("<h1>Products: " + p.getName()  +" "+
                p.getContent()+ " "+p.getPrice()+" !</h1>"));

        HttpSession session = req.getSession();
        resp.getWriter().println("My name is :"+session.getAttribute("user"));

        out.println("</body>");
        out.println("</html>");
    }
}