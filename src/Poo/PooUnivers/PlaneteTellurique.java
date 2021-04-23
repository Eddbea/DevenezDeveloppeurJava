package Poo.PooUnivers;

public class PlaneteTellurique extends Planete implements Habitable {

    Vaisseau[] vaisseauxAccostes;

    PlaneteTellurique(String nom) {
        super(nom);
    }

    PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        this.vaisseauxAccostes=new Vaisseau[tailleBaie];
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
    public boolean restePlaceDisponibles(int nbVaisseauArrivant) {
        System.out.println("Bonjour, y a t il de la place disponible chez vous ?");
        System.out.println("-Bonjour, nous avons : " + vaisseauxAccostes.length+ " place(s) disponible(s)");
        System.out.println("-Affichage du nombre de vaisseau qui arrive(nt) : " +nbVaisseauArrivant+ " vaisseau(x)");
        int nbBaie= vaisseauxAccostes.length;
        int placeDisponible=0;
        placeDisponible=nbBaie-nbVaisseauArrivant;
            if (placeDisponible<=0) {
                placeDisponible=0;
                System.out.println("-Affichage de la place disponible : " +placeDisponible);
                System.out.println("-Le vaisseau ne peut pas se poser sur la planete par manque de place dans la baie");
                return false;
            }
            else {
                return true;
                //System.out.println("-Le nombre de place disponible est de : " + placeDisponible);
            }
    }
 /*
    boolean restePlaceDisponible(){
        for(int index=0; index<vaisseauxAccostes.length; index++){
            if(vaisseauxAccostes[index]==null){
                return true;
            }
        }
        return false;
    }

  */
}