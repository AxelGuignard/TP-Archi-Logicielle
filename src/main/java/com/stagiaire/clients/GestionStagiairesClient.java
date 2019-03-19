package com.stagiaire.clients;
import java.io.IOException;
import com.stagiaire.dao.DaoConfigurationException;
import com.stagiaire.dao.DaoFactory;
import com.stagiaire.dao.Database;
import com.stagiaire.dao.DatabaseFactory;
import com.stagiaire.services.GroupeService;
import com.stagiaire.services.StagiaireService;
import com.stagiaire.services.VilleService;
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