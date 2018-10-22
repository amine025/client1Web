package controleur;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Client;
import model.DateClient;
import model.Gestionnaire;

public class TraitementServlet extends HttpServlet {
    
    String clientJson;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String ddn = request.getParameter("ddn");
        
        String[] arrayInfos = ddn.split("-");
        
        DateClient ddnClient = Gestionnaire.createDateClient(arrayInfos);
        
        Client client = Gestionnaire.createClient(nom,prenom,ddnClient);
        
        clientJson = Gestionnaire.clientJSON(client);
        
        String jsonDateClient = Gestionnaire.dateClientJSON(ddnClient);
        
        String message = "{\"nom\":\"Amine\",\"prenom\":\"Ghodbane\",\"ddn\":{\"annee\":\"1999\",\"mois\":\"05\",\"jour\":\"05\"}}";
        System.out.println("#####################################################################################################");
             
        request.setAttribute("client", clientJson);
        
        RequestDispatcher disp = request.getRequestDispatcher("/test.jsp");
        
        disp.forward(request, response);
        
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
