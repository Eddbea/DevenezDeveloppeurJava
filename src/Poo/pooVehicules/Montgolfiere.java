package Poo.pooVehicules;

public class Montgolfiere implements Amarable{

    int surface;

    @Override
    public int combienDeCordes(int vitesseDuVent) {
        int nbcordes = surface/10;
        nbcordes = nbcordes+vitesseDuVent/100;
        return nbcordes;
    }
}
