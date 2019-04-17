import main.java.com.stagiaire.dao.*;
import main.java.com.stagiaire.pojo.*;
import main.java.com.stagiaire.services.*;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Database database;
        DaoFactory daoFactory;
        GroupeService groupeService;
        VilleService villeService;
        StagiaireService stagiaireService;

        int input;
        boolean end = false;

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
            }

            while (!end)
            {
                for (Groupe groupe : groupeService.getAll())
                {
                    System.out.println(groupe.getIdGroupe() + ": " + groupe.getNom());
                }

                System.out.println("0: Quitter");

                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
                scanner.nextLine();

                Groupe chosenGroupe = null;
                for (Groupe groupe : groupeService.getAll())
                {
                    if (input == groupe.getIdGroupe())
                    {
                        chosenGroupe = groupe;
                    }
                    else if (input == 0)
                    {
                        return;
                    }
                }

                boolean endStagiaire = false;
                while (!endStagiaire)
                {
                    for (Stagiaire stagiaire : stagiaireService.getAllByGroupe(chosenGroupe.getIdGroupe()))
                    {
                        System.out.println("-------------");
                        System.out.println("Id: " + stagiaire.getIdStagiaire());
                        System.out.println("Nom: " + stagiaire.getNom());
                        System.out.println("Prenom: " + stagiaire.getPrenom());
                        System.out.println("Ville: " + villeService.getVilleById(stagiaire.getIdVille()).getNom());
                    }

                    System.out.println("-------------");
                    System.out.println("1: Ajouter un stagiaire");
                    System.out.println("2: Retirer un stagiaire du groupe");
                    System.out.println("3: Retour à la liste des groupes");

                    input = scanner.nextInt();
                    scanner.nextLine();

                    switch (input)
                    {
                        case 1:
                            System.out.println("Entrez le nom du stagiaire");
                            String nom = scanner.nextLine();
                            System.out.println("Entrez le prénom du stagiaire");
                            String prenom = scanner.nextLine();
                            for (Ville ville : villeService.getAll())
                            {
                                System.out.println(ville.getIdVille() + ": " + ville.getNom());
                            }
                            System.out.println("Sélectionnez la ville de résidence");
                            int ville = scanner.nextInt();
                            scanner.nextLine();

                            stagiaireService.createStagiaire(new Stagiaire(nom, prenom, ville, (int)chosenGroupe.getIdGroupe()));

                            System.out.println("Le stagiaire a bien été ajouté");
                            scanner.nextLine();

                            endStagiaire = true;
                            break;
                        case 2:
                            System.out.println("Entrez l'id du stagiaire à retirer");
                            int id = scanner.nextInt();

                            boolean found = false;
                            for (Stagiaire stagiaire : stagiaireService.getAllByGroupe(chosenGroupe.getIdGroupe()))
                            {
                                if (id == stagiaire.getIdStagiaire())
                                {
                                    found = true;
                                    stagiaireService.deleteStagiaire(stagiaire);
                                }
                            }

                            if(!found)
                            {
                                System.out.println("L'id saisi ne correspond à aucun stagiaire de ce groupe");
                            }
                            scanner.nextLine();

                            endStagiaire = true;
                            break;
                        case 3:
                            endStagiaire = true;
                            break;
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Ca marche pas parce que " + e.getMessage());
        }
    }
}
