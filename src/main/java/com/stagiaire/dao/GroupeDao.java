package main.java.com.stagiaire.dao;

import main.java.com.stagiaire.pojo.Groupe;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GroupeDao extends Dao<Groupe>
{
    public static final String TABLE_NAME = "groupe";
    GroupeDao(Database db, String tableName)
    {
        super(db, tableName);
    }

    @Override
    public Groupe find(long id)
    {
        String requete = String.format("SELECT * FROM %s WHERE idGroupe =?", TABLE_NAME);
        return getItemOnQuery(requete, id);
    }

    @Override
    public List<Groupe> list()
    {
        String requete = String.format("SELECT * FROM %s", TABLE_NAME);
        return getListOnQuery(requete);
    }

    @Override
    public Groupe insert(Groupe obj)
    {
        String requete = String.format("INSERT INTO %s (nom,dateDebut,dateDebutStage,dateFin)" + " VALUES(?,?,?,?)", TABLE_NAME);
        obj.setIdGroupe(insert(requete
            , obj.getNom()
            , obj.getDateDebut()
            , obj.getDateDebutStage()
            , obj.getDateFin()));
        return obj;
    }

    @Override
    public void update(Groupe obj)
    {
        String requete = String.format("UPDATE %s SET " + " nom = ? " + " WHERE idGroupe = ?", TABLE_NAME);
        update(requete
                , obj.getNom()
                , obj.getDateDebut()
                , obj.getDateDebutStage()
                , obj.getDateFin());
    }

    @Override
    public void delete(Groupe obj)
    {
        String requete = String.format("DELETE FROM %s WHERE idGroupe = ?",TABLE_NAME);
        delete(requete, obj.getIdGroupe());
    }

    @Override
    public Groupe load(ResultSet resultSet) throws SQLException {
        Groupe groupe = new Groupe();
        groupe.setIdGroupe(resultSet.getInt("idGroupe"));
        groupe.setNom(resultSet.getString("nom"));
        groupe.setDateDebut(resultSet.getDate("dateDebut"));
        groupe.setDateDebutStage(resultSet.getDate("dateDebutStage"));
        groupe.setDateFin(resultSet.getDate("dateFin"));
        return groupe;
    }
}
