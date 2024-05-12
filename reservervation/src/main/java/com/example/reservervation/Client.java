package com.example.reservervation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Client {

    @Id
    @Column(name = "Id_vol")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVol;

    @ManyToOne
    @JoinColumn(name = "ID_vol")
    private vol vol;

    private String compagnie;
    private Date dateDepart;
    private Date dateArrivee;
    private int prix;

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "Compagnie: " + compagnie + ", Date de départ: " + sdf.format(dateDepart) +
                ", Date d'arrivée: " + sdf.format(dateArrivee) + ", Prix: " + prix;
    }

    public Client() {
        super();
    }

    public Client(vol vol, String compagnie, Date dateDepart, Date dateArrivee, int prix) {
        super();
        this.vol = vol;
        this.compagnie = compagnie;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.prix = prix;
    }

    public Client(int idVol, vol vol, String compagnie, Date dateDepart, Date dateArrivee, int prix) {
        super();
        this.idVol = idVol;
        this.vol = vol;
        this.compagnie = compagnie;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.prix = prix;
    }

    // Getters and setters
}
