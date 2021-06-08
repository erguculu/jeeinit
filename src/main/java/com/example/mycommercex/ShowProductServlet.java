package com.example.mycommercex;

import com.example.mycommercex.bo.MyProduct;
import com.example.mycommercex.dao.MyProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowProductServlet", value = "/showProduct")
public class ShowProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        long id  = Long.parseLong(req.getParameter("id"));
        MyProduct p = MyProductDao.findProductById(id);

        resp.setContentType("text/html"); PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ShowProductServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>The id is: "+p.getId() +" !</p>");
        out.println("<p>The product is: "+p.getName() +" !</p>");
        out.println("<p>Content is: "+p.getContent() +" !</p>");
        out.println("<p>Price is: "+p.getPrice() +" !</p>");
        out.println("</body>");
        out.println("</html>");
    }
}