package Poo.pooVehicules;

public class Voiture extends Vehicule implements Vidangeable, Lavable {

    static int nbRoues = 4;


    int nbPortes = 5;
    TypeBoiteVitesse typeBoite;
    String couleur;
    Integer rapportCourant;

    Voiture() {
    }

    Voiture(String couleur) {
        this.couleur = couleur;
        System.out.println("Une voiture est construite avec la couleur");
    }

    Voiture(int nbportes) {
        this.nbPortes = nbportes;
        System.out.println("Une voiture est construite avec le nombre de portes");
    }

    //Voiture(String couleur, int nbPortes){
    //this.couleur = couleur;
    //this.nbPortes = nbPortes;
    //System.out.println("Une voiture est construite avec le nombre de porte avec la couleur");

    Voiture(String carburation, int nbCylindres) {
        Moteur moteur = new Moteur();
        moteur.carburation = carburation;
        moteur.nbCylindres = nbCylindres;
    }

    static void tourner(boolean droite, int angle) {
        String droiteOuGauche = null;
        if (droite) {
            droiteOuGauche = "droite";
        } else {
            droiteOuGauche = "gauche";
        }
        System.out.println("les " + nbRoues + " roues de la voiture tournent à " + droiteOuGauche + " d'un angle de " + angle);
    }

    int passerRapport(boolean augmenter) {
        if (augmenter) {
            rapportCourant++;
        } else {
            rapportCourant--;
        }
        return rapportCourant;
    }

    /*void tourner(String droiteOuGauche, int angle) {
        System.out.println("la voiture va tourner a " + droiteOuGauche + " d'un angle de " + angle);
    }*/

    /*Ville transporter(Passager passager, Ville villeDeDepart) {
        System.out.println("La voiture transporte un passager qui s'appelle " + passager.prenom + " " + passager.nom + ".");
        System.out.println("Le passager est parti de la ville de " + villeDeDepart.nom + ".");

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Wellington";

        return villeDeDestination;
    }*/

    @Override
    public void vidanger() {
        System.out.println("Devisser le bouchon sous la culasse et attandre que ca coule");
    }

    @Override
    public void lavable() {
        System.out.println("Je lave ceci");
    }

    @Override
    void klaxonner() {
        System.out.println("Knutt knutt!");
    }
}
