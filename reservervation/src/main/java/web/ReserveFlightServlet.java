package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;

import java.io.*;

public class ReserveFlightServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupération des données du formulaire de réservation
        String flightDetails = request.getParameter("flight_details");
        String passengerName = request.getParameter("passenger_name");
        String paymentInfo = request.getParameter("payment_info");

        // Validation des données (à adapter en fonction de vos besoins)
        if (flightDetails != null && passengerName != null && paymentInfo != null) {
            // Enregistrement de la réservation dans la base de données (à adapter)
            boolean reservationSaved = saveReservationToDatabase(flightDetails, passengerName, paymentInfo);

            if (reservationSaved) {
                // Redirection vers la page de confirmation de réservation
                response.sendRedirect("reservation_confirmation.jsp");
            } else {
                // En cas d'échec de l'enregistrement de la réservation, afficher un message d'erreur
                request.setAttribute("errorMessage", "Erreur lors de l'enregistrement de la réservation. Veuillez réessayer.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
                dispatcher.forward(request, response);
            }
        } else {
            // Si des données obligatoires sont manquantes, afficher un message d'erreur
            request.setAttribute("errorMessage", "Tous les champs sont obligatoires. Veuillez remplir le formulaire correctement.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }
    }

    private boolean saveReservationToDatabase(String flightDetails, String passengerName, String paymentInfo) {
        // Code pour enregistrer la réservation dans la base de données (à adapter)
        // Retourne true si la réservation est enregistrée avec succès, sinon false
        return true; // Pour cet exemple, on suppose que la réservation est toujours enregistrée avec succès
    }
}
