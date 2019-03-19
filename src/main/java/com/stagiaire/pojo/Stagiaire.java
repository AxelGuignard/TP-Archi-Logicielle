package main.java.com.stagiaire.pojo;

public class Stagiaire
{
    private int idStagiaire;
    private String nom;
    private String prenom;
    private int idVille;
    private int idGroupe;


    public Stagiaire(int idStagiaire, String nom, String prenom, int idVille, int idGroupe)
    {
        this.idStagiaire = idStagiaire;
        this.nom = nom;
        this.prenom = prenom;
        this.idVille = idVille;
        this.idGroupe = idGroupe;
    }

    public int getIdStagiaire()
    {
        return idStagiaire;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public int getIdVille()
    {
        return idVille;
    }

    public void setIdVille(int idVille)
    {
        this.idVille = idVille;
    }

    public int getIdGroupe()
    {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe)
    {
        this.idGroupe = idGroupe;
    }
}
