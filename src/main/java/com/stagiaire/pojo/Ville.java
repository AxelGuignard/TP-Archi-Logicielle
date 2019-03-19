package main.java.com.stagiaire.pojo;

public class Ville
{
    private long idVille;
    private String nom;

    public Ville(long idVille, String nom)
    {
        this.idVille = idVille;
        this.nom = nom;
    }

    public long getIdVille()
    {
        return idVille;
    }

    public void setIdVille(long idVille)
    {
        this.idVille = idVille;
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
