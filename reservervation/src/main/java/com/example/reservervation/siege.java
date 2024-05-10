package com.example.reservervation;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class siege {

    @Id
    private  int ids  ;

    private int  nums;
    private boolean etat;
    private int id_vol;


    public siege(){
        super();
    }

    public siege(int ids,int nums,boolean etat,int id_vol ){
        super();
        this.ids=ids;
        this.nums=nums;
        this.etat=etat;
        this.id_vol=id_vol;
    }

    public void setId_vol(int id_vol ){
        this.id_vol=id_vol;
    }

    public void setIds(int  ids ){
        this.ids=ids;
    }

    public void setNums(int   nums ){
        this.nums=nums;
    }

    public void setEtat(boolean  etat ){
        this.etat=etat;
    }


    public int getId_vol(){
        return id_vol;
    }

    public int getIds(){
        return getIds();
    }


    public boolean getEtat(){
        return etat;
    }
    public int getNums(){
        return nums;
    }
}