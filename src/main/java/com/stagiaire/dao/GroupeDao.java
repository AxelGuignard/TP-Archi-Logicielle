package main.java.com.stagiaire.dao;

import main.java.com.stagiaire.pojo.Groupe;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GroupeDao extends Dao
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
    public Groupe insert(Object obj)
    {
        return null;
    }

    @Override
    public void update(Object obj)
    {

    }

    @Override
    public void delete(Object obj)
    {

    }

    @Override
    public Object load(ResultSet resultSet) throws SQLException
    {
        return null;
    }
}
