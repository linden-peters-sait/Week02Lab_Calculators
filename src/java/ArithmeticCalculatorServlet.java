/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lpeters
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        String sOne = request.getParameter("one");
        String sTwo = request.getParameter("two");
        String bAdd = request.getParameter("add");
        String bSub = request.getParameter("sub");
        String bMul = request.getParameter("mul");
        String bMod = request.getParameter("mod");
        request.setAttribute("one", sOne);
        request.setAttribute("two", sTwo);
        if (sOne != null && sTwo != null) {
            if (!sOne.equals("") && !sTwo.equals("")) {
                try {
                    int one = Integer.parseInt(sOne);
                    int two = Integer.parseInt(sTwo);
                    if (bAdd != null) {
                        request.setAttribute("res", one + two);
                    } else if (bSub != null) {
                        request.setAttribute("res", one - two);
                    } else if (bMul != null) {
                        request.setAttribute("res", one * two);
                    } else if (bMod != null) {
                        request.setAttribute("res", one % two);
                    }
                } catch (NumberFormatException e) {
                    request.setAttribute("res", "invalid");
                }
            } else {
                request.setAttribute("res", "invalid");
            }
        } else {
            request.setAttribute("res", "---");
        }
        getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
