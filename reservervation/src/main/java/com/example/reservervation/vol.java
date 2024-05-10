package com.example.reservervation;

import javax.persistence.Entity;

import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class vol {

    @Id
    private  int id_vol  ;

    private String ville_depart;
    private String destination;
    private LocalDate date_depart;
    private LocalDate date_retour;


    int  nbr_passager ;
    private String comp_aeri;
    private float  prix;
    private int   duree;

    public vol(){
        super();
    }

    public vol(int id_vol,String ville_depart,String destination,LocalDate date_depart , LocalDate date_retour ,int nbr_passager,String comp_aeri,float prix, int duree){
        super();
        this.id_vol=id_vol;
        this.ville_depart=ville_depart;
        this.destination=destination;
        this.date_depart=date_depart;
        this.nbr_passager=nbr_passager;
        this.comp_aeri=comp_aeri;
        this.prix=prix;
        this.duree=duree;
        this.date_retour=date_retour;
    }

    public void setId_vol(int id_vol ){
        this.id_vol=id_vol;
    }

    public void setVille_depart(String  ville_depart ){
        this.ville_depart=ville_depart;
    }

    public void setDestination(String  destination ){
        this.destination=destination;
    }

    public void setDate_depart(LocalDate  date_depart ){
        this.date_depart=date_depart;
    }

    public void setNbr_passager(int  nbr_passager ){
        this.nbr_passager=nbr_passager;
    }


    public void setPrix(float prix ){
        this.prix=prix;
    }

    public void setDate_retour(LocalDate date_retour ){
        this.date_retour=date_retour;
    }



    public void setComp_aeri(String  comp_aeri ){
        this.comp_aeri=comp_aeri;
    }


    public void setDuree(int duree ){
        this.duree=duree;
    }
    public int getId_vol(){
        return id_vol;
    }

    public String getVille_depart(){
        return ville_depart;
    }


    public String getDestination(){
        return destination;
    }

    public LocalDate getDate_depart(){
        return date_depart;
    }

    public LocalDate getDate_retour(){
        return date_retour;
    }

    public int getNbr_passager(){
        return nbr_passager;
    }

    public String getComp_aeri(){
        return comp_aeri;
    }

    public float getPrix(){
        return prix;
    }

    public int getDuree(){
        return duree;
    }
}
