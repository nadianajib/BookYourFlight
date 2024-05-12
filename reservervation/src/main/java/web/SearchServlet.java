package web;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SearchServlet", urlPatterns = {"/SearchServlet"})
public class SearchServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérer les paramètres de la recherche
        String departure = request.getParameter("departure");
        String destination = request.getParameter("destination");
        String departDate = request.getParameter("departDate");
        String returnDate = request.getParameter("returnDate");
        int passengers = Integer.parseInt(request.getParameter("passengers"));

        // Appeler un service ou un DAO pour effectuer la recherche de vols
        // et stocker les résultats dans un attribut de la requête
        // request.setAttribute("flights", listeDeVols);

        // Rediriger vers la page des résultats de recherche
        request.getRequestDispatcher("searchResults.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet de recherche de vols";
    }

}