/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cookies;

/**
 *
 * @author Dell
 */
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet{
    public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException, IOException{
      res.setContentType("text/html");
      PrintWriter out= res.getWriter();
      Cookie[] c=req.getCookies();
      out.print(c[0].getValue());
    }
}