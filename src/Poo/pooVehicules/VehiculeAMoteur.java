package Poo.pooVehicules;

public class VehiculeAMoteur {

    Moteur moteur;
    int vitesse;

    VehiculeAMoteur(){
    }

    int accelerer(int vitesse) {
        System.out.println("J'accelere");
        this.vitesse = this.vitesse + vitesse;
        return this.vitesse;
    }


    Ville transporter(Passager passager, Ville villeDeDepart){
        System.out.println("Le vehicule transporte un passager qui s'appelle " +passager.prenom+ " " +passager.nom+".");
        System.out.println("Le passager est parti de la ville de "+villeDeDepart.nom+".");

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom="Wellington";

        return villeDeDestination;
    }

}
