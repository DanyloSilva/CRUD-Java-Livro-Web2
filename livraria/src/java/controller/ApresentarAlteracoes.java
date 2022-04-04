/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;
import negocios.Livro;
import repositorio.RepositorioLivro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author danylosilva
 */
@WebServlet(name = "ApresentarAlteracoes", urlPatterns = {"/ApresentarAlteracoes"})
public class ApresentarAlteracoes extends HttpServlet {

    
    
    
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
        try ( PrintWriter out = response.getWriter()) {
             
        int id = Integer.parseInt(request.getParameter("id"));       
        Livro l = RepositorioLivro.ler(id);

            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ApresentarAlteracoes</title>");            
            out.println("</head>");
            out.println("<body>");

out.println("<h1>Altere o livro</h1>");
            out.println("<a href='EditarLivro'>livros</a><br>");
            out.println("<form method='post' action='EditarLivro'>");
            out.println("<input type='hidden' name='id' value='"+l.getId()+"'/>");
            out.println("Nome: <input type=\"text\" name=\"nome\" value='"+l.getNome()+"'><br>");
            out.println("autor: <input type=\"text\" name=\"autor\" value='"+l.getAutor()+"'><br>");
            out.println("Data: <input type=\"text\" name=\"ano\" value='"+l.getAno()+"'><br>");
            out.println("Sessão: <input type=\"text\" name=\"ses\" value='"+l.getSes()+"'><br>");
            out.println("Pratileira: <input type=\"text\" name=\"pra\" value='"+l.getPra()+"'><br>");
            out.println("Genero: <input type=\"text\" name=\"gen\" value='"+l.getGen()+"'><br>");

            out.println("<input type='submit' value='enviar'/>");
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
