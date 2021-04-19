package Poo.PooUnivers;

import java.util.Scanner;

public class HelloUniverse {

    public static void main(String[] args) {
/*      int nbPlanetes = 8;
        while (nbPlanetes < 11) {
            switch (nbPlanetes) {
                case 8:
                    System.out.println("Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : " + nbPlanetes);
                    break;
                case 9:
                    System.out.println("Il y a quelques années cependant, elles étaient au nombre de : " + nbPlanetes);
                    break;
                default:
                    System.out.println("Au cours de l'ère moderne, le nombre de planètes n'a jamais été officiellement de : " + nbPlanetes);
            }
            nbPlanetes++;
        }
        System.out.println();

*/

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;


        mercure.atmosphere = new Atmosphere();
        mercure.atmosphere.tauxHydrogene = 22.0f;
        mercure.atmosphere.tauxMethane = 0.0f;
        mercure.atmosphere.tauxAzote = 0.0f;
        mercure.atmosphere.tauxHelium = 0.0f;
        mercure.atmosphere.tauxArgon = 0.0f;
        mercure.atmosphere.tauxDioxydeCarbone = 0.0f;
        mercure.atmosphere.tauxSodium = 29.0f;
        mercure.atmosphere.tauxNitrogen = 0.0f;
        mercure.atmosphere.tauxOxygen = 42.0f;
        mercure.atmosphere.otherGases = 7.0f;


        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;

        venus.atmosphere = new Atmosphere();
        venus.atmosphere.tauxHydrogene = 0.0f;
        venus.atmosphere.tauxMethane = 0.0f;
        venus.atmosphere.tauxAzote = 0.0f;
        venus.atmosphere.tauxHelium = 0.0f;
        venus.atmosphere.tauxArgon = 0.0f;
        venus.atmosphere.tauxDioxydeCarbone = 96.0f;
        venus.atmosphere.tauxSodium = 0.0f;
        venus.atmosphere.tauxNitrogen = 0.0f;
        venus.atmosphere.tauxOxygen = 0.0f;
        venus.atmosphere.otherGases = 1.0f;


        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;

        terre.atmosphere = new Atmosphere();
        terre.atmosphere.tauxHydrogene = 78.0f;
        terre.atmosphere.tauxMethane = 0.0f;
        terre.atmosphere.tauxAzote = 0.0f;
        terre.atmosphere.tauxHelium = 0.0f;
        terre.atmosphere.tauxArgon = 1.0f;
        terre.atmosphere.tauxDioxydeCarbone = 0.0f;
        terre.atmosphere.tauxSodium = 0.0f;
        terre.atmosphere.tauxNitrogen = 0.0f;
        terre.atmosphere.tauxOxygen = 21.0f;
        terre.atmosphere.otherGases = -1.0f;

        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;

        mars.atmosphere = new Atmosphere();
        mars.atmosphere.tauxHydrogene = 0.0f;
        mars.atmosphere.tauxMethane = 0.0f;
        mars.atmosphere.tauxAzote = 0.0f;
        mars.atmosphere.tauxHelium = 0.0f;
        mars.atmosphere.tauxArgon = 1.5f;
        mars.atmosphere.tauxDioxydeCarbone = 95.0f;
        mars.atmosphere.tauxSodium = 0.0f;
        mars.atmosphere.tauxNitrogen = 3.0f;
        mars.atmosphere.tauxOxygen = 0.0f;
        mars.atmosphere.otherGases = 0.5f;


        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;

        jupiter.atmosphere = new Atmosphere();
        jupiter.atmosphere.tauxHydrogene = 90.0f;
        jupiter.atmosphere.tauxMethane = 0.0f;
        jupiter.atmosphere.tauxAzote = 0.0f;
        jupiter.atmosphere.tauxHelium = 10.0f;
        jupiter.atmosphere.tauxArgon = 0.0f;
        jupiter.atmosphere.tauxDioxydeCarbone = 0.0f;
        jupiter.atmosphere.tauxSodium = 0.0f;
        jupiter.atmosphere.tauxNitrogen = 0.0f;
        jupiter.atmosphere.tauxOxygen = 0.0f;
        jupiter.atmosphere.otherGases = -1.0f;


        PlaneteGazeuse saturne = new PlaneteGazeuse("saturne");
        saturne.diametre = 120536;

        saturne.atmosphere = new Atmosphere();
        saturne.atmosphere.tauxHydrogene = 96.0f;
        saturne.atmosphere.tauxMethane = 0.0f;
        saturne.atmosphere.tauxAzote = 0.0f;
        saturne.atmosphere.tauxHelium = 3.0f;
        saturne.atmosphere.tauxArgon = 0.0f;
        saturne.atmosphere.tauxDioxydeCarbone = 0.0f;
        saturne.atmosphere.tauxSodium = 0.0f;
        saturne.atmosphere.tauxNitrogen = 0.0f;
        saturne.atmosphere.tauxOxygen = 0.0f;
        saturne.atmosphere.otherGases = 1.0f;


        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        //uranus.atmosphere = new Atmosphere();
        //uranus.atmosphere.tauxHydrogene = 83f;
        //uranus.atmosphere.tauxMethane = 2.5f;
        //uranus.atmosphere.tauxAzote = 0.0f;
        //uranus.atmosphere.tauxHelium = 15f;
        //uranus.atmosphere.tauxArgon = 0.0f;
        //uranus.atmosphere.tauxDioxydeCarbone = 0.0f;
        //uranus.atmosphere.tauxSodium = 0.0f;
        //uranus.atmosphere.tauxNitrogen = 0.0f;
        //uranus.atmosphere.tauxOxygen = 0.0f;
        //uranus.atmosphere.otherGases = 0.0f;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        neptune.atmosphere = new Atmosphere();
        neptune.atmosphere.tauxHydrogene = 80.0f;
        neptune.atmosphere.tauxMethane = -1.0f;
        neptune.atmosphere.tauxAzote = 0.0f;
        neptune.atmosphere.tauxHelium = 19.0f;
        neptune.atmosphere.tauxArgon = 0.0f;
        neptune.atmosphere.tauxDioxydeCarbone = 0.0f;
        neptune.atmosphere.tauxSodium = 0.0f;
        neptune.atmosphere.tauxNitrogen = 0.0f;
        neptune.atmosphere.tauxOxygen = 0.0f;
        neptune.atmosphere.otherGases = 0.0f;
/*
        System.out.println(jupiter.nom + " est une planete avec un diametre de " + jupiter.diametre + " kilometres.");
        System.out.println();

        PlaneteGazeuse planetePlutonNeufSednaPhattie = new PlaneteGazeuse("neufSednaPhattie");
        planetePlutonNeufSednaPhattie.diametre = 0;

        System.out.println(planetePlutonNeufSednaPhattie.nom + " est une planete avec un diametre de " + planetePlutonNeufSednaPhattie.diametre + " kilometres.");

        neptune.revolution(-3542);
        System.out.println("Neptune a effectue " + neptune.revolution(-3542) + " tours autour de son etoile");

        mars.rotation(-684);
        System.out.println("Mars a effectue " + mars.rotation(-684) + " tours sur elle-meme'");

        venus.rotation(1250);
        System.out.println("Venus a effectue " + venus.rotation(1250) + " tours sur elle-meme'");


        System.out.println();
        System.out.println("Uranus est compose de :");
        System.out.println("d'hydrogène à " + uranus.atmosphere.tauxHydrogene + "%");
        System.out.println("de méthane à " + uranus.atmosphere.tauxMethane + "%");
        System.out.println("d'azote à " + uranus.atmosphere.tauxAzote + "%");
        System.out.println("d'hélium à " + uranus.atmosphere.tauxHelium + "%");
        System.out.println("d'argon à " + uranus.atmosphere.tauxArgon + "%");
        System.out.println("de dioxyde de carbon à " + uranus.atmosphere.tauxDioxydeCarbone + "%");
        System.out.println("de sodium à " + uranus.atmosphere.tauxSodium + "%");


        // ------------------------------------------------------------------------------------------//


        VaisseauDeGuerre nouveauVaisseau = new VaisseauDeGuerre("FREGATE");
        nouveauVaisseau.nbPassagers = 9;

        VaisseauDeGuerre autreVaisseau = new VaisseauDeGuerre("CROISEUR");
        autreVaisseau.nbPassagers = 42;

        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " + mars.nbTotalHumains);
        System.out.println("La forme d'une planete est " + Planete.forme + ".");
        System.out.println("La forme de la planete " + mars.nom + " est " + mars.forme + ".");
        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));
        System.out.println("Le nombre de planetes decouvertes est actuellement de : " + Planete.nbPlanetesDecouvertes + ".");
        System.out.println();


        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.blindage = 156;
        chasseur.resistanceBouclier = 2;


        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceBouclier = 30;


        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();

        ((VaisseauDeGuerre) chasseur).attaque(vaisseauMonde, "lasersPhotoniques", 3);
        vaisseauMonde.desactiverBouclier();
        System.out.println("Duree de protection residuelle du bouclier du VaisseauMonde : " + vaisseauMonde.resistanceBouclier + ".");
        System.out.println("Blindage du vaisseauMonde : " + vaisseauMonde.blindage + ".");

        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);

        VaisseauDeGuerre chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseurSurTerre);
        System.out.println("Le chasseur a rejete " + chasseurSurTerre.emporterCargaison(20) + " tonnes");

        VaisseauDeGuerre fregateSurTerre = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre.nbPassagers = 100;
        terre.accueillirVaisseau(fregateSurTerre);
        System.out.println("La fregate a rejete " +fregateSurTerre.emporterCargaison(45)+ " tonnes.");
        System.out.println("La fregate a rejete " +fregateSurTerre.emporterCargaison(12)+ " tonnes.");

        VaisseauDeGuerre fregateSurTerre2 = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre2.nbPassagers = 14;
        terre.accueillirVaisseau(fregateSurTerre2);
        System.out.println("La fregate 2 a rejete " +fregateSurTerre2.emporterCargaison(30)+ " tonnes.");

        VaisseauCivil vaisseauMondeSurTerre = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMondeSurTerre.nbPassagers = 0;
        terre.accueillirVaisseau(vaisseauMondeSurTerre);
        System.out.println("Le vaisseau-monde a rejete " +vaisseauMondeSurTerre.emporterCargaison(1560)+ " tonnes.");
        System.out.println("Le vaisseau-monde " +vaisseauMondeSurTerre.emporterCargaison(600)+ " tonnes.");

 */

        Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        Vaisseau croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nbPassagers = 24;
        Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
        Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);

        Scanner enter = new Scanner(System.in);

        System.out.println("Quel vaisseau souhaitez vous manipuler ? ");
        String choixVaisseau = enter.nextLine();
        System.out.println("Vous avez choisi : "+choixVaisseau+".");

        System.out.println("Sur quelle planete Tellurique souhaitez vous vous poser : Mercure, Venus, Terre ou Mars ?");
        String quellePlaneteTellurique = enter.nextLine();
        System.out.println("Vous avez choisi d'atterir sur la planete : "+quellePlaneteTellurique+".");

        System.out.println("Quelle tonnage de cargaison souhaitez vous embarquer ?");
        int tonnageEmbarque = enter.nextInt();

      TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(choixVaisseau);
      Vaisseau vaisseau = null;
      switch (typeVaisseau){
          case CHASSEUR:
              vaisseau = chasseur;
              break;
          case CROISEUR:
              vaisseau = croiseur;
              break;
          case FREGATE:
              vaisseau = fregate;
              break;
          case CARGO:
              vaisseau = cargo;
              break;
          case VAISSEAUMONDE:
              vaisseau = vaisseauMonde;
              break;
      }

      PlaneteTellurique planete = null;
        switch (quellePlaneteTellurique){
            case "Mercure" :
                planete = mercure;
                break;
            case "Venus" :
                planete = venus;
                break;
            case "Terre" :
                planete = terre;
                break;
            case "Mars" :
                planete = mars;
                break;
        }

        planete.accueillirVaisseau(vaisseau);
        int rejet = vaisseau.emporterCargaison(tonnageEmbarque);

        System.out.println("Le rejet est de "+rejet+".");

// TP Classes conteneur ou Wrapper

        Atmosphere atmosphereUranus = new Atmosphere();

        uranus.atmosphere = atmosphereUranus;
        atmosphereUranus.tauxHydrogene = new Float(83f);
// Auto Boxing permet de :
        //atmosphereUranus.tauxHelium = 15f;
        //atmosphereUranus.tauxMethane = 2.5f;
        atmosphereUranus.tauxMethane = new Float(2.5f);
        atmosphereUranus.tauxHelium = new Float(15f);
        atmosphereUranus.tauxAzote = new Float(0f);

        System.out.println();
        System.out.println("Uranus est compose de :");
        if (uranus.atmosphere.tauxHydrogene!=null) {
            System.out.println("d'hydrogène à " + uranus.atmosphere.tauxHydrogene + "%");
            // Pour connaitre sa valoir sous forme de type primitif on peut ecrire :  System.out.println("d'hydrogène à " + uranus.atmosphere.tauxHydrogene.floatValue() + "%");
        }
        if (uranus.atmosphere.tauxMethane!=null) {
            System.out.println("de méthane à " + uranus.atmosphere.tauxMethane + "%");
        }
        if (uranus.atmosphere.tauxAzote!=null) {
            System.out.println("d'azote à " + uranus.atmosphere.tauxAzote + "%");
        }
        if (uranus.atmosphere.tauxHelium!=null) {
            System.out.println("d'hélium à " + uranus.atmosphere.tauxHelium + "%");
        }
        if (uranus.atmosphere.tauxArgon!=null) {
            System.out.println("d'argon à " + uranus.atmosphere.tauxArgon + "%");
        }
        if (uranus.atmosphere.tauxDioxydeCarbone!=null) {
            System.out.println("de dioxyde de carbon à " + uranus.atmosphere.tauxDioxydeCarbone + "%");
        }
        if (uranus.atmosphere.tauxSodium!=null) {
            System.out.println("de sodium à " + uranus.atmosphere.tauxSodium + "%");
        }
    }
}