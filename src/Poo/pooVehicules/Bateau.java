package Poo.pooVehicules;

public class Bateau implements Amarable{

    int masse;

    @Override
    public int combienDeCordes(int vitesseDuVent) {
        int nbcordes = masse/10;
        nbcordes = nbcordes+vitesseDuVent/100;
        return nbcordes;
    }
}
