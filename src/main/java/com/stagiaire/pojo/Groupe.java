package main.java.com.stagiaire.pojo;

import java.util.Date;

public class Groupe
{
    private long idGroupe;
    private String nom;
    private Date dateDebut;
    private Date dateDebutStage;
    private Date dateFin;

    public Groupe()
    {

    }

    public Groupe(String nom, Date dateDebut, Date dateDebutStage, Date dateFin)
    {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateDebutStage = dateDebutStage;
        this.dateFin = dateFin;
    }


    public long getIdGroupe()
    {
        return idGroupe;
    }

    public void setIdGroupe(long idGroupe)
    {
        this.idGroupe = idGroupe;
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

    public Date getDateDebutStage()
    {
        return dateDebutStage;
    }

    public void setDateDebutStage(Date dateDebutStage)
    {
        this.dateDebutStage = dateDebutStage;
    }
}
