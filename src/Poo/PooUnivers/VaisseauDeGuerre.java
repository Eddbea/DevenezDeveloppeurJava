package Poo.PooUnivers;

public class VaisseauDeGuerre extends Vaisseau{

    boolean armesDesactivees;

    VaisseauDeGuerre(TypeVaisseau typeVaisseau){
        this.type =type;

        if(type==TypeVaisseau.CHASSEUR){
            tonnageMax = 0;
        }
        else if (type==TypeVaisseau.FREGATE){
            tonnageMax = 50;
        }
        else if (type==TypeVaisseau.CROISEUR){
            tonnageMax = 100;
        }
    }

    void attaque(Vaisseau vaisseauAttaque, String armeUtilisee, int dureeAttaque){
        if(armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est desactive");
        }
        else {
            System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseauAttaque.type + " en utilisant l'arme " + armeUtilisee + " pendant " + dureeAttaque + " minutes");
            vaisseauAttaque.resistanceBouclier = 0;
            vaisseauAttaque.blindage = vaisseauAttaque.blindage / 2;
        }
    }

    void desactiverArmes (){
        System.out.println("Desactivation des armes d'un vaisseau de type " +type+ ".");
        armesDesactivees = true;
    }
    void activerBouclier(){
        desactiverArmes();
        super.activerBouclier();
    }

    @Override
    int emporterCargaison(int cargaison) {
        if(type==TypeVaisseau.CHASSEUR){
            return cargaison;
        }
        else {
            if(nbPassagers<12){
                return cargaison;
            }
            else {
                int tonnagePassagers = 2*nbPassagers;
                int tonnageRestant = tonnageMax - tonnageActuel;
                int tonnageAConsiderer = (tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
                if(cargaison>tonnageAConsiderer){
                    tonnageActuel = tonnageMax;
                    return cargaison - tonnageAConsiderer;
                }
                else {
                    tonnageActuel = tonnageActuel + cargaison; // ou on peut ecrire : tonnageActuel+=cargaison;//
                    return 0;
                }
            }
        }
    }
}
