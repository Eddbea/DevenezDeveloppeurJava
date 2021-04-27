package Poo.PooUnivers;

public class PlaneteTellurique extends Planete implements Habitable {

    Vaisseau[][] baieAccostage;
    int totalVisiteurs;

    public PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        baieAccostage = new Vaisseau[tailleBaie][tailleBaie];
    }

    boolean restePlaceDisponible(Vaisseau vaisseau) {

        int indexZone=0;

        //if(vaisseau instanceof VaisseauDeGuerre)
        switch (vaisseau.type){
            case CARGO:
            case VAISSEAUMONDE:
                indexZone=1;
        }

        for (int index = 0; index < baieAccostage[indexZone].length; index++) {
            if (baieAccostage[indexZone][index] == null) {
                return true;
            }
        }
        return false;
    }


    public void accueillirVaisseaux(Vaisseau... vaisseaux) {

        for(int i=0;i<vaisseaux.length;i++){

        int indexZone=0;
        switch (vaisseaux[i].type){
            case CARGO:
            case VAISSEAUMONDE:
                indexZone=1;
        }

        for (int index = 0; index < baieAccostage[indexZone].length; index++) {
                if (baieAccostage[indexZone][index] == null) {
                    baieAccostage[indexZone][index] = vaisseaux[i];
                    break;
                }
            }
            if (vaisseaux[i] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) vaisseaux[i]).desactiverArmes();
            }
            totalVisiteurs += vaisseaux[i].nbPassagers;
        }
    }
}