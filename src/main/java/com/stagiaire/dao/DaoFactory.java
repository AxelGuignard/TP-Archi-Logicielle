package main.java.com.stagiaire.dao;
import main.java.com.stagiaire.dao.Database;

public class DaoFactory {
    private Database db;
    public DaoFactory(Database db) {
        this.db = db;
    }
    public VilleDao getVilleDao() {
        return new VilleDao(db);
    }
    public GroupeDao getGroupeDao() {
        return new GroupeDao(db, "groupe");
    }
    public StagiaireDao getStagiaireDao() {
        return new StagiaireDao(db);
    }
 // TODO : TO CHECK
} 
