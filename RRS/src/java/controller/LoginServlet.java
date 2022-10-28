package controller;

import dao.AccountDAO;
import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AccountDTO;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        request.getRequestDispatcher("view/managers/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String username = request.getParameter("Username");
        String password = request.getParameter("Password");
        AccountDAO dao = new AccountDAO();
        try {
            AccountDTO account = dao.searchUser(username, password);
  //          System.out.println("Account" + account.getUsername());
            if (account == null) {
                String error = "User or password is empty or error";
                request.setAttribute("ERROR", error);
                RequestDispatcher rd = request.getRequestDispatcher("view/managers/login.jsp");
                rd.forward(request, response);
            } else {
                if (!account.isTrangThai()) {
                    String error = "Account is disabled or deleted";
                    request.setAttribute("ERROR", error);
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                } else if (account.getPhanQuyen() != 0) {
                    HttpSession session = request.getSession();
                    session.setAttribute("ACCOUNT", account);
                    response.sendRedirect("ShowServletUser");
                } else {
                    HttpSession session = request.getSession();
                    session.setAttribute("ACCOUNT", account);
                    response.sendRedirect("view/managers/index.jsp");
     //               System.out.println("Da toi dc day r"); co the co the co the
                }
            }
        } catch (Exception e) {
            System.out.println("Login Servlet Error:" + e.getMessage());
        }
    }

}