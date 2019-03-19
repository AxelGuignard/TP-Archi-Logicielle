package main.java.com.stagiaire.pojo;

public class Ville
{
    private int idVille;
    private String nom;

    public Ville(int idVille, String nom)
    {
        this.idVille = idVille;
        this.nom = nom;
    }

    public int getIdVille()
    {
        return idVille;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }
}
