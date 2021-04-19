package Poo.PooUnivers;

public abstract class Vaisseau {

    int nbPassagers;
    int blindage;
    int resistanceBouclier;
    int quantiteRejetee;
    int tonnageMax;
    int tonnageActuel;
    TypeVaisseau type;


    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " +type+ ".");
    }

    void desactiverBouclier() {
        System.out.println("Desactivation du bouclier d'un vaisseau de type " +type+ ".");
    }

    abstract int emporterCargaison(int cargaison);

}
