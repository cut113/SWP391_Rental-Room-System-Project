/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.RoomDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RoomDTO;
import model.AccountDTO;

@WebServlet(name = "AddRoomServlet", urlPatterns = {"/AddRoomServlet"})
public class AddRoomServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        RoomDAO dao = new RoomDAO();
        String TieuDe = request.getParameter("TieuDe");
        String Loai = request.getParameter("Loai");
        String LienHe = request.getParameter("LienHe");
        String SDT = request.getParameter("SDT");
        int DienTich = Integer.parseInt(request.getParameter("DienTich"));
        float GiaThue = Float.parseFloat(request.getParameter("GiaThue"));
        String DiaChi = request.getParameter("DiaChi");
        String GhiChu = request.getParameter("GhiChu");
        int MaDuong = Integer.parseInt(request.getParameter("MaDuong"));
        AccountDTO currentAccount = (AccountDTO) request.getSession().getAttribute("ACCOUNT");
        int maUser = currentAccount.getUserID();
        PrintWriter out = response.getWriter();
        boolean err = false;
        new RoomDAO().addRoom(TieuDe, Loai, LienHe, SDT, DienTich, GiaThue, DiaChi, GhiChu, MaDuong, maUser);
        RequestDispatcher rd = request.getRequestDispatcher("ListUserServlet");
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(AddRoomServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(AddRoomServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
