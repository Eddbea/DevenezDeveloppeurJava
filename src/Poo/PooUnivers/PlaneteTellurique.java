package Poo.PooUnivers;

public class PlaneteTellurique extends Planete implements Habitable{

    Vaisseau[] vaisseauxAccostes;
    int totalVisiteurs;

    public PlaneteTellurique(String nom, int nbPlacesBaie) {
        super(nom);
        vaisseauxAccostes=new Vaisseau[nbPlacesBaie];
    }

    boolean restePlaceDisponible(){
        for (int i=0 ; i<vaisseauxAccostes.length ; i++){
            if (vaisseauxAccostes[i]==null){
                return true;
            }
        }
        return false;
    }

    public void accueillirVaisseau(Vaisseau nouveauVaisseau){

        if (nouveauVaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre)nouveauVaisseau).desactiverArmes();
        }

        totalVisiteurs+=nouveauVaisseau.nbPassagers;

        for (int i=0 ; i<vaisseauxAccostes.length ; i++){
            if (vaisseauxAccostes[i]==null){
                vaisseauxAccostes[i]=nouveauVaisseau;
                break;
            }
        }

    }
}