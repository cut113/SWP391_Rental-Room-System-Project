package controller;

import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AccountDTO;

public class RegisterServlet extends HttpServlet {

    private final String forwardPage = "addAccount.jsp";
    private final String successPage = "dang-nhap.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(forwardPage).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // get UTF-8 encoding
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String username = request.getParameter("Username");
            String password = request.getParameter("Password");
            String fullname = request.getParameter("Fullname");
            String sdt =request.getParameter("SDT");
            String email = request.getParameter("Email");
            String diachi = request.getParameter("DiaChi");
            AccountDAO dao = new AccountDAO();
            AccountDTO ac = dao.getAccountByUserName(username);
            if (ac != null) {
                String error = "Duplicate user!!!";
                request.setAttribute("ERROR", error);
                request.getRequestDispatcher(forwardPage).forward(request, response);
            }

            dao.addAccountByUser(username, password, fullname, sdt, email, diachi);

            response.sendRedirect(successPage);
        } catch (Exception e) {
            System.out.println("addAccountServlet ERROR: " + e.getMessage());
        }
    }
}
