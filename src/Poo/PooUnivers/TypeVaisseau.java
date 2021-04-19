package Poo.PooUnivers;

public enum TypeVaisseau {

    CHASSEUR("Chasseur"), FREGATE("Fregate"), CROISEUR("croiseur"), CARGO("Cargo"), VAISSEAUMONDE("Vaisseau-Monde");

    String nom;

    TypeVaisseau(String nom){
        this.nom = nom;
    }
}
