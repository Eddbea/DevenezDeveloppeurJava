package Poo.PooUnivers;

public class PlaneteTellurique extends Planete implements Habitable {

    int[] baieAccostage;

    PlaneteTellurique(String nom) {
        super(nom);
    }

    PlaneteTellurique(String nom, int[] baieAccostage ) {
        super(nom);
        this.baieAccostage = baieAccostage;
    }

    @Override
    public void accueillirVaisseau(Vaisseau vaisseau) {

        if (vaisseau instanceof VaisseauDeGuerre) {
            ((VaisseauDeGuerre) vaisseau).desactiverArmes();
        }
        nbTotalHumains = nbTotalHumains + vaisseau.nbPassagers;
        if (vaisseauActuellementAcoste == null) {
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println("Un vaisseau de type " + vaisseauActuellementAcoste.type + " doit s'en aller");
        }
        vaisseauActuellementAcoste = vaisseau;
    }

    @Override
    public boolean restePlaceDisponible(int nbVaisseauArrivant) {
        System.out.println(baieAccostage.length);
        boolean disponible=true;
        nbVaisseauArrivant++;
        int placeDisponible=nbVaisseauArrivant-baieAccostage.length;
            if(placeDisponible<=0){
                disponible=false;
                System.out.println("Le vaisseau ne peut pas se poser sur la planete par manque de place dans la baie");
            }
            else {
                disponible=true;
                System.out.println("Le nombre de place disponible est de : "+placeDisponible);

                System.out.println("le nombre de place disponible est de ");
        }
        return disponible;
    }
}
