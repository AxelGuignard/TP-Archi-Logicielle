package main.java.com.stagiaire.services;
import java.util.List;
import main.java.com.stagiaire.dao.DaoFactory;
import main.java.com.stagiaire.dao.GroupeDao;
import main.java.com.stagiaire.pojo.Groupe;

public class GroupeService {
    private DaoFactory daoFactory;
    public GroupeService(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
    
    public Groupe createGroupe(Groupe Groupe) {
        GroupeDao GroupeDao = daoFactory.getGroupeDao();
        return GroupeDao.insert(Groupe);
    }
    
    public Groupe getGroupeById(int id) {
        GroupeDao GroupeDao = daoFactory.getGroupeDao();
        return GroupeDao.find(id);
    }
    
    public void updateGroupe(Groupe Groupe) {
        GroupeDao GroupeDao = daoFactory.getGroupeDao();
        GroupeDao.update(Groupe);
    }
    
    public void deleteGroupe(Groupe Groupe) {
        GroupeDao GroupeDao = daoFactory.getGroupeDao();
        GroupeDao.delete(Groupe);
    }
    
    public List<Groupe> getAll() {
        GroupeDao GroupeDao = daoFactory.getGroupeDao();
        return GroupeDao.list();
    }
} 
