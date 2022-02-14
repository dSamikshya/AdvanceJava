/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cookies;



import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet{
    public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String user=req.getParameter("fname");
        Cookie ck=new Cookie("fname",user);
        res.addCookie(ck);
        out.print("<a href='http://localhost:8080/CreatingCookies/SecondServlet'>View Cookie</a>");
        
        
    }
    
}