/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.RoomDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.AccountDTO;

@MultipartConfig
public class AddRoomServlet extends HttpServlet {

    private final String forwardPage = "addProduct.jsp";
    private final String successPage = "ShowServletAdmin";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher(forwardPage).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set Encoding
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String tieuDe = request.getParameter("tieuDe");
            String Loai = request.getParameter("Loai");
            String lienHe = request.getParameter("LienHe");
            String SDT = request.getParameter("SDT");
            int dienTich = Integer.parseInt(request.getParameter("DienTich")) ;
            float giaThue = Float.parseFloat(request.getParameter("GiaThue"));
            String diaChi = request.getParameter("DiaChi");
            String ghiChu = request.getParameter("GhiChu");
            int maDuong = Integer.parseInt(request.getParameter("MaDuong"));

            AccountDTO currentAccount = (AccountDTO) request.getSession().getAttribute("ACCOUNT");
            int maUser = currentAccount.getUserID();

            new RoomDAO().addRoom(tieuDe, Loai, lienHe, SDT, dienTich, giaThue, diaChi, ghiChu, maDuong,maUser);
            RequestDispatcher rd = request.getRequestDispatcher(successPage);
            rd.forward(request, response);
        } catch (Exception e) {
            System.out.println("addProductServlet Post ERROR: " + e.getMessage());
        }

    }
}
