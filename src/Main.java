import main.java.com.stagiaire.dao.*;
import main.java.com.stagiaire.pojo.*;
import main.java.com.stagiaire.services.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Database database = null;
        DaoFactory daoFactory = null;
        GroupeService groupeService = null;
        VilleService villeService = null;
        StagiaireService stagiaireService = null;

        try
        {
            database = DatabaseFactory.createDatabase();
            daoFactory = new DaoFactory(database);

            groupeService = new GroupeService(daoFactory);
            villeService = new VilleService(daoFactory);
            stagiaireService = new StagiaireService(daoFactory);

            if (groupeService.getAll().size() == 0)
            {
                for (int i = 0; i < 10; i++)
                {
                    groupeService.createGroupe(new Groupe("groupe" + i));
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Ca marche pas");
        }
    }
}
