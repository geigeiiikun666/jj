package kkk;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("all")
/**
 @Author:JNTM
 @Version:1.0
 @Date:21:29
 */
@WebServlet("/ser01")
public class mm extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("utf-8");
        //控制台输出
        System.out.println("jjntm");
        //通过流输出到浏览器
        resp.getWriter().write("ntnnd");


        String nn=req.getParameter("uname");
        String pp=req.getParameter("upd");
        System.out.println("用户名："+nn);
        System.out.println("用户名："+pp);
    }


}
