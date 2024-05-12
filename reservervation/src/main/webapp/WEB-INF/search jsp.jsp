<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Recherche de vols</title>
</head>
<body>
<h1>Recherche de vols</h1>
<form action="SearchFlightServlet" method="post">
    <label for="departureCity">Ville de départ:</label>
    <input type="text" id="departureCity" name="departureCity" required><br><br>

    <label for="destination">Destination:</label>
    <input type="text" id="destination" name="destination" required><br><br>

    <label for="departureDate">Date de départ:</label>
    <input type="date" id="departureDate" name="departureDate" required><br><br>

    <label for="returnDate">Date de retour:</label>
    <input type="date" id="returnDate" name="returnDate"><br><br>

    <label for="passengers">Nombre de passagers:</label>
    <input type="number" id="passengers" name="passengers" min="1" required><br><br>

    <input type="submit" value="Rechercher">
</form>
</body>
</html>

