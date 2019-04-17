import main.java.com.stagiaire.dao.*;
import main.java.com.stagiaire.pojo.*;
import main.java.com.stagiaire.services.*;

import java.io.IOException;
import java.util.Date;

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
                Date currentDate = new Date();
                for (int i = 0; i < 10; i++)
                {
                    groupeService.createGroupe(new Groupe("groupe" + i,currentDate,currentDate,currentDate));
                }

                for (Groupe groupe : groupeService.getAll())
                {

                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Ca marche pas");
        }
    }
}
