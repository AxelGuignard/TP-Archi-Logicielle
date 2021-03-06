package main.java.com.stagiaire.services;
import java.util.ArrayList;
import java.util.List;
import main.java.com.stagiaire.dao.DaoFactory;
import main.java.com.stagiaire.dao.StagiaireDao;
import main.java.com.stagiaire.pojo.Stagiaire;

public class StagiaireService {
    private DaoFactory daoFactory;
    public StagiaireService(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
    
    public Stagiaire createStagiaire(Stagiaire Stagiaire) {
        StagiaireDao StagiaireDao = daoFactory.getStagiaireDao();
        return StagiaireDao.insert(Stagiaire);
    }
    
    public Stagiaire getStagiaireById(int id) {
        StagiaireDao StagiaireDao = daoFactory.getStagiaireDao();
        return StagiaireDao.find(id);
    }
    
    public void updateStagiaire(Stagiaire Stagiaire) {
        StagiaireDao StagiaireDao = daoFactory.getStagiaireDao();
        StagiaireDao.update(Stagiaire);
    }
    
    public void deleteStagiaire(Stagiaire Stagiaire) {
        StagiaireDao StagiaireDao = daoFactory.getStagiaireDao();
        StagiaireDao.delete(Stagiaire);
    }
    
    public List<Stagiaire> getAll() {
        StagiaireDao StagiaireDao = daoFactory.getStagiaireDao();
        return StagiaireDao.list();
    }

    public List<Stagiaire> getAllByGroupe(long idGroupe)
    {
        List<Stagiaire> stagiaires = new ArrayList<Stagiaire>();
        for (Stagiaire stagiaire : this.getAll())
        {
            if(stagiaire.getIdGroupe() == idGroupe)
            {
                stagiaires.add(stagiaire);
            }
        }

        return stagiaires;
    }
} 
