package main.java.com.stagiaire.pojo;

import java.util.Date;

public class Groupe
{
    private int idGroupe;
    private String nom;
    private Date dateDebut;
    private Date dateFin;

    Groupe(int idGroupe, String nom, Date dateDebut, Date dateFin)
    {
        this.idGroupe = idGroupe;
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }


    public int getIdGroupe()
    {
        return idGroupe;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public Date getDateDebut()
    {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut)
    {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin()
    {
        return dateFin;
    }

    public void setDateFin(Date dateFin)
    {
        this.dateFin = dateFin;
    }
}
