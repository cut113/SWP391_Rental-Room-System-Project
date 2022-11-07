/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.RoomDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.AccountDTO;

/**
 *
 * @author ASUS
 */
@MultipartConfig
@WebServlet(name = "AddNewRoomServlet", urlPatterns = {"/AddNewRoomServlet"})
public class AddNewRoomServlet extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            System.out.println("Add new RoomServlet");
            String tieude = request.getParameter("tieuDe");
            String loai = request.getParameter("loai");
            int dientich = Integer.parseInt(request.getParameter("dienTich"));
            float giathue = Float.parseFloat(request.getParameter("giaThue"));
            String diachi = request.getParameter("diaChi");
            String ghichu = request.getParameter("ghiChu");
            String lienhe = request.getParameter("lienHe");
            String sdt = request.getParameter("sdt");
            int maduong = 1;
            AccountDTO currentAccount = (AccountDTO) request.getSession().getAttribute("ACCOUNT");
            int maUser = currentAccount.getUserID();

            Part image = request.getPart("Image");

                        String path = "E:\\FPT\\Kì 5 Chuyên Ngành\\SWP391\\Full Project\\RentalRoomProject\\RRS\\web\\resources\\anh";
//            String path = "D:\\backup\\RRS\\web\\resources\\anh";
            String fileName = image.getSubmittedFileName();
            String filePath = path + "\\" + fileName;
            System.out.println("duong dan" + filePath);
            image.write(filePath);

            System.out.println(tieude + loai + dientich + giathue + diachi + ghichu + lienhe + sdt + maUser);
            RoomDAO dao = new RoomDAO();

            dao.addRoom(tieude, loai, lienhe, sdt, dientich, giathue, diachi, ghichu, maduong, maUser, fileName);
            response.sendRedirect("DefaultServlet");

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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(AddNewRoomServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(AddNewRoomServlet.class.getName()).log(Level.SEVERE, null, ex);
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
