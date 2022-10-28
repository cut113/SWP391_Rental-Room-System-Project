/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAO;
import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AccountDTO;


public class ListUserServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       
        try {
            
            AccountDAO dao = new AccountDAO();
      
            List<AccountDTO> result1 = dao.getUser();
            System.out.println("CUUUUUU");
            
            for (AccountDTO items : result1) {
                System.out.println("Ten " + items.getUserID());
                System.out.println("Ten " + items.getUsername());
                System.out.println("Ten " + items.getPassword());
                System.out.println("Ten " + items.getFullname());
                System.out.println("Ten " + items.getSDT());
                System.out.println("Ten " + items.getEmail());
                System.out.println("Ten " + items.getDiaChi());
                System.out.println("Ten " + items.getPhanQuyen());
                System.out.println("Ten " + items.isTrangThai());
            }
            
            request.setAttribute("RESULT1", result1);
            
            System.out.println("Da vo dc ShowServlet");
            RequestDispatcher rd = request.getRequestDispatcher("listUser.jsp");
            rd.forward(request, response);
            
        } catch (SQLException ex) {
            log("SearchServlet_SQL " + ex.getMessage());
        } catch (NamingException ex) {
            log("SearchServlet_JNDI " + ex.getMessage());
        } catch (Exception ex) {

        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}