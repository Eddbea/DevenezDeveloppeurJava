package Poo.PooUnivers;

public abstract class Planete {

    String nom;
    long diametre;
    int totalVisiteurs;
    int nbTotalHumains;
    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAcoste;

    Planete(String nom) {
        this.nom = nom;
        nbPlanetesDecouvertes++;
    }

    static String expansion(double distanceEntre2Planete) {
        if (distanceEntre2Planete <= 14) {
            return "Oh là là mais c'est super rapide";
        } else {
            return "Je reve ou c'est plus rapide que la lumiere";
        }
    }

    int revolution(int angle) {
        return angle / 360;
    }

    int rotation(int angle) {
        return angle / 360;
    }

}


