package Poo.PooUnivers;

public class PlaneteTellurique extends Planete implements Habitable {

    PlaneteTellurique(String nom) {
        super(nom);
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
}
