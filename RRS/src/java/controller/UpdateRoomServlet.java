/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.RoomDAO;
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
import model.RoomDTO;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "UpdateRoomServlet", urlPatterns = {"/UpdateRoomServlet"})
public class UpdateRoomServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateRoomServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateRoomServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        try {
            String maphong = request.getParameter("maphong");
            System.out.println("phong: " + maphong);
            RoomDAO dao = new RoomDAO();
            RoomDTO u = dao.getRoomByID(Integer.parseInt(maphong));
            request.setAttribute("u", u);
            request.getRequestDispatcher("updateRoom.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(UpdateRoomServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String maphong = request.getParameter("maphong");
            String tieude = request.getParameter("tieude");
            String loaiphong = request.getParameter("loai");
            String lienhe = request.getParameter("lienhe");
            String sdt = request.getParameter("sdt");

            String dientich = request.getParameter("dientich");
            String giathue = request.getParameter("giathue");
            String diachi = request.getParameter("diachi");
            String ghichu = request.getParameter("ghichu");

            RoomDAO dao = new RoomDAO();
            dao.updateRoom(maphong, tieude, loaiphong, lienhe, sdt, dientich, giathue, diachi, ghichu);
            AccountDTO currentAccount = (AccountDTO) request.getSession().getAttribute("ACCOUNT");
            int role = currentAccount.getPhanQuyen();
            if (role == 0) {
                response.sendRedirect("ListUserServlet");
            } else {
                response.sendRedirect("ListRoomServlet");
            }

        } catch (Exception ex) {
            Logger.getLogger(UpdateRoomServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
