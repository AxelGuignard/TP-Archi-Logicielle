package com.stagiaire.clients;
import java.io.IOException;
import com.stagiaires.dao.DaoConfigurationException;
import com.stagiaires.dao.DaoFactory;
import com.stagiaires.dao.Database;
import com.stagiaires.dao.DatabaseFactory;
import com.stagiaires.services.GroupeService;
import com.stagiaires.services.StagiaireService;
import com.stagiaires.services.VilleService;
public class GestionStagiairesClient {
    private static Database database = null;
    private static DaoFactory daoFactory = null;
    private static GroupeService groupeService = null;
    private static StagiaireService stagiaireService = null;
    private static VilleService villeService = null;
    public static void main(String[] args) {
        try {
            database = DatabaseFactory.createDatabase();
            daoFactory = new DaoFactory(database);

            groupeService = new GroupeService(daoFactory);
            stagiaireService = new StagiaireService(daoFactory);
            villeService = new VilleService(daoFactory);
// TODO : implémenter les fonctions de la Gestion de stagiaires
        }
        catch (DaoConfigurationException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}