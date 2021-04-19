package Poo.pooVehicules;

public enum TypeBoiteVitesse {

    AUTO("Automatique"),
    SEMI_AUTO("Semi-automatique"),
    MANUELLE("Manuelle");

    String nomTypeBoite;

    private TypeBoiteVitesse(String nomTypeBoite){
        this.nomTypeBoite=nomTypeBoite;
    }
}
