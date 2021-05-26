package Poo.PooUnivers;

public enum TypeVaisseau {

    CHASSEUR("Chasseur"), FREGATE("Frégate"), CROISEUR("Croiseur"), CARGO("Cargo"), VAISSEAUMONDE("Vaisseau-Monde");
    public String nom;

    TypeVaisseau(String nom) {
        this.nom = nom;
    }

}
