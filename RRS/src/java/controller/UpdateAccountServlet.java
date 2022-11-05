/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AccountDTO;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "UpdateAccountServlet", urlPatterns = {"/UpdateAccountServlet"})
public class UpdateAccountServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("userName");
        System.out.println("id: " + username);
        AccountDAO dao = new AccountDAO();
        AccountDTO u = dao.getUser(username);
        System.out.println(u.getEmail());
        request.setAttribute("a", u);
        request.getRequestDispatcher("tai-khoan.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        System.out.println("username: " + username);
        String password = request.getParameter("password");
        System.out.println("password: " + password);
        String fullname = request.getParameter("fullname");
        System.out.println("fullname: " + fullname);
        String sdt = request.getParameter("sdt");
        System.out.println("sdt: " + sdt);
        String email = request.getParameter("email");
        System.out.println("email: " + email);
        String diachi = request.getParameter("diachi");
        System.out.println("diachi: " + diachi);
        AccountDAO dao = new AccountDAO();
        try {
            dao.updateAccount(username, password, fullname, sdt, email, diachi);
        } catch (Exception ex) {
            Logger.getLogger(UpdateUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("DefaultServlet");

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
