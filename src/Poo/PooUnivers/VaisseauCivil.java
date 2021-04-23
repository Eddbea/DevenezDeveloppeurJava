package Poo.PooUnivers;

public class VaisseauCivil extends Vaisseau {

    VaisseauCivil(TypeVaisseau typeVaisseau) {
        this.type = typeVaisseau;
        if (type == TypeVaisseau.CARGO) {
            tonnageMax = 500;
        } else if (type == TypeVaisseau.VAISSEAUMONDE) {
            tonnageMax = 2000;
        }
    }

    @Override
    int emporterCargaison(int cargaison) {
        int tonnageRestant = tonnageMax - tonnageActuel;
        if (cargaison > tonnageRestant) {
            tonnageActuel = tonnageMax;
            return cargaison - tonnageRestant;
        } else {
            tonnageActuel = tonnageActuel + cargaison;
            return 0;
        }
    }

    @Override
    public void accueillirVaisseau(Vaisseau vaisseau) {
    }

    @Override
    public boolean restePlaceDisponibles(int nbPassagerArrivant) {
        return false;
    }
}
