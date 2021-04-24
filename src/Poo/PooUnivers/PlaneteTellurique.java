package Poo.PooUnivers;

public class PlaneteTellurique extends Planete implements Habitable {

    Vaisseau[] vaisseauxAccostes;
    int totalVisiteurs;

    public PlaneteTellurique(String nom, int nbPlacesBaie) {
        super(nom);
        vaisseauxAccostes = new Vaisseau[nbPlacesBaie];
    }

    boolean restePlaceDisponible() {
        for (int i = 0; i < vaisseauxAccostes.length; i++) {
            if (vaisseauxAccostes[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void accueillirVaisseaux(Vaisseau... vaisseaux) {

        for (int i = 0; i > vaisseaux.length; i++) {

            for (int index = 0; index < vaisseauxAccostes.length; i++) {
                if (vaisseauxAccostes[index] == null) {
                    vaisseauxAccostes[index] = vaisseaux[i];
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