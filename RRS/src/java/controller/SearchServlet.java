/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.SearchDTO;
import dao.SearchDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RoomDTO;
import model.SearchCityDTO;
import model.SearchDistrictDTO;

@WebServlet(name = "SearchServlet", urlPatterns = {"/SearchServlet"})
public class SearchServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NamingException, Exception {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        SearchDAO dao = new SearchDAO();
        SearchDAO dao1 = new SearchDAO();
        String tenTP = request.getParameter("TenTP");
        String tenQuan = request.getParameter("TenQuan");
        String tenDuong = request.getParameter("TenDuong");
        System.out.println("ten duong la: " + tenDuong);
        float gia = Float.parseFloat(request.getParameter("Gia"));
        int dienTich = Integer.parseInt(request.getParameter("DienTich"));
            
        List<RoomDTO> result = dao.getRoom(tenDuong, gia, dienTich);
        List<SearchCityDTO> tp = dao1.getTenTP();
        List<SearchDistrictDTO> q = dao1.getTenQuan();
        List<SearchDTO> d = dao1.getTenDuong();
        List<SearchDTO> gdt = dao1.getGiaDienTich();
        request.setAttribute("TP", tp);
        request.setAttribute("Q", q);
        request.setAttribute("D", d);
        request.setAttribute("GDT", gdt);
        request.setAttribute("listP", result);
        System.out.println("Da vo dc ShowServlet");
        request.getRequestDispatcher("view/pages/index.jsp").forward(request, response);
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
            Logger.getLogger(SearchServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            request.getRequestDispatcher("DefaultServlet").forward(request, response);
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
