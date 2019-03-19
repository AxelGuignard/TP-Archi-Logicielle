package main.java.com.stagiaire.pojo;

public class Groupe
{
    private int idGroupe;
    private String nom;
    private String dateDebut;
    private String dateFin;

    Groupe(int idGroupe, String nom, String dateDebut, String dateFin)
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

    public String getDateDebut()
    {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut)
    {
        this.dateDebut = dateDebut;
    }

    public String getDateFin()
    {
        return dateFin;
    }

    public void setDateFin(String dateFin)
    {
        this.dateFin = dateFin;
    }
}
