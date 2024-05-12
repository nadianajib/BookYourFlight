<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Réservation de Vol</title>
</head>
<body>
<h1>Réservation de Vol</h1>
<form action="save" method="post">
  <label for="ville_depart">Ville de départ:</label>
  <input type="text" id="ville_depart" name="ville_depart" required><br><br>

  <label for="date_depart">Date de départ:</label>
  <input type="date" id="date_depart" name="date_depart" required><br><br>

  <label for="destination">Destination:</label>
  <input type="text" id="destination" name="destination" required><br><br>

  <label for="nombre_passagers">Nombre de passagers:</label>
  <input type="number" id="nombre_passagers" name="nombre_passagers" required><br><br>

  <label for="prix">Prix:</label>
  <input type="number" id="prix" name="prix" required><br><br>

  <label for="compagnie">Compagnie:</label>
  <input type="text" id="compagnie" name="compagnie" required><br><br>

  <input type="submit" value="Réserver">
</form>
</body>
</html>
