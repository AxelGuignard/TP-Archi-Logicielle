package main.java.com.stagiaire.dao;

import main.java.com.stagiaire.pojo.Groupe;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GroupeDao extends Dao<Groupe>
{
    GroupeDao(Database db, String tableName)
    {
        super(db, tableName);
    }

    @Override
    public Groupe find(long id)
    {
        return null;
    }

    @Override
    public List<Groupe> list()
    {
        return null;
    }

    @Override
    public Groupe insert(Groupe obj)
    {
        return null;
    }

    @Override
    public void update(Groupe obj)
    {

    }

    @Override
    public void delete(Groupe obj)
    {

    }

    @Override
    public Groupe load(ResultSet resultSet) throws SQLException
    {
        return null;
    }
}
