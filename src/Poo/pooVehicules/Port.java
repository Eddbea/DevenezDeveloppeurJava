package Poo.pooVehicules;

public class Port {

    void accueilleEngin(Amarable amarable) {

        if(!(amarable instanceof Bateau)) {
            System.out.println("Il s'agit bien d'un bateau");
        }
        if(amarable instanceof Amarable) {
            System.out.println("Il s'agit bien d'une instance de Amarable");
        }

        int nbCordes = amarable.combienDeCordes(50);
        System.out.println("Le nombre de cordes necessaires est de " +nbCordes+".");
    }
}
