package Poo.pooVehicules;

import java.util.*;

public class HelloWorld {

    int unAttribut=5;
    void quelqueChose(){

        System.out.println("QuelqueChose");
    }


    public static void main(String[] args) {


        // (Vehicule(VehiculeAMoteur voitureDeMichel() = new Voiture("Jaune");


///// ------ TRANSTYPAGE------ ou transtyper la variable en acrivant :


        // ((Voiture)voitureDeMichel).automatique=true;

        //----------------------OU-----------------------

        // Voiture voitureDeMichelSousFormeDeVoiture = (Voiture) voitureDeMichel;


        //voitureDeMichelSousFormeDeVoiture.couleur="verte";

/////--------------------------------------------------//

        // System.out.println("La couleur de la voiture de Michel est : "+voitureDeMichelSousFormeDeVoiture.couleur+".");

        //voitureDeMichelSousFormeDeVoiture.couleur="jaune";
        System.out.println();
        //System.out.println("La voiture de Michel est " + voitureDeMichelSousFormeDeVoiture.couleur + " et elle dispose de " + voitureDeMichelSousFormeDeVoiture.nbPortes + " portes.");
        System.out.println();

        //voitureDeMichelSousFormeDeVoiture.klaxonner();
        //System.out.println("La nouvelle vitesse de la voiture est : " +voitureDeMichel.accelerer(50)+ " km/h.");
        System.out.println();

        //int nouvelleVitesse= voitureDeMichel.accelerer(50);
        //System.out.println("Nouvelle Vitesse : " +nouvelleVitesse);
        System.out.println();

        // int nouveauRapport= voitureDeMichelSousFormeDeVoiture.passerRapport(true);

        //System.out.println("Le nouveau rapport est : " +nouveauRapport);

        // voitureDeMichelSousFormeDeVoiture.passerRapport(true);
        // voitureDeMichelSousFormeDeVoiture.passerRapport(true);
        // nouveauRapport=voitureDeMichelSousFormeDeVoiture.passerRapport(false);

        //System.out.println("Le nouveau rapport est : "+nouveauRapport);

        //voitureDeMichelSousFormeDeVoiture.tourner("gauche`", 45);

        Voiture voitureDeJerome = new Voiture("Bleue", 5);

        // boolean egauxOuNon=voitureDeJerome==voitureDeMichel;

        //System.out.println(egauxOuNon);

        String chaine1 = new String("Le ciel est Bleu");
        String chaine2 = "Le ciel est bleu";

        boolean egauxOuPas = chaine1.equalsIgnoreCase(chaine2);
        System.out.println(egauxOuPas);

        //int nouvelleVitesse2=voitureDeMichel.accelerer(50);
        //System.out.println(nouvelleVitesse2);

        Voiture voitureDeMarty = new Voiture(4);
        Moteur moteurVoitureMarty = new Moteur();
        moteurVoitureMarty.carburation = "diesel";
        moteurVoitureMarty.nbCylindres = 6;
        //voitureDeMarty.moteur=moteurVoitureMarty;
        //voitureDeMichel.moteur=moteurVoitureMarty;

        moteurVoitureMarty.nbCylindres = 8;
        //System.out.println("Le nombre de cylindres de la voiture de Marty est " +voitureDeMarty.moteur.nbCylindres);
        //System.out.println("Le nombre de cylindres de la voiture de Michel est " +voitureDeMichelSousFormeDeVoiture.moteur.nbCylindres);
        //System.out.println("Le nombre de cylindres de la voiture de Michel est " +voitureDeMichel.moteur.nbCylindres);

        Passager passager = new Passager();
        passager.nom = "Dupont";
        passager.prenom = "Vincent";

        Ville angers = new Ville();
        angers.nom = "Angers";

        //Ville destination= voitureDeMichel.transporter(passager, angers);
        //System.out.println("Le passager est arrive dans le ville de "+destination.nom+".");

        //System.out.println("Le nombre de roue de la voiture de Michel est " +voitureDeMichelSousFormeDeVoiture.nbRoues+ ".");
        System.out.println("Le nombre de roue de la voiture de Michel est " + voitureDeMarty.nbRoues + ".");
        System.out.println("Le nombre de roue d'une voiture en general est " + Voiture.nbRoues + ".");

        Voiture.nbRoues = 8;

        //System.out.println("Le nombre de roue de la voiture de Michel est " +voitureDeMichelSousFormeDeVoiture.nbRoues+ ".");
        System.out.println("Le nombre de roue de la voiture de Michel est " + voitureDeMarty.nbRoues + ".");
        System.out.println("Le nombre de roue d'une voiture en general est " + Voiture.nbRoues + ".");

        Voiture.nbRoues = 4;

        //Voiture.klaxonner();
        //Voiture.tourner(true, 45);

        Voiture voitureDuDoc = new Voiture();

        //voitureDeJerome.klaxonner();


//--------------Covariance des methodes--------------//


        UsineDAssemblageVoiture ua = new UsineDAssemblageVoiture();
        //Voiture vam = ua.assemble();

//-------------Interfaces Implements----------------//

        Bateau b = new Bateau();
        b.masse = 60;
        Port p = new Port();
        p.accueilleEngin(b);


//-------------Polymorphisme (de sous typage)---------//


        Voiture peugeot206 = new Voiture();
        //VehiculeAMoteur peugeot207 = new Voiture();
        Vidangeable peugeot508 = new Voiture(); // Cette variable (peugeot508) ne peut etre que vidangeable - la seule chose a laquelle j'ai acces est la methode vidanger

//--------------La Classe System--------------------//


        System.out.println("HelloWorld");
        System.out.print(" idem sans saut de ligne");

        System.out.println();

        // flux d'ecriture en erreur //
        //System.err.println(" Oups");

        //System.in == Classe Scanner

        //Sortie de programme, parametre "0" signifie sortie normale du prog - Ce code signifie " tout s'est bien passé //
        //System.exit(0);

        //Sortie de programme, parametre "0" signifie sortie avec erreur - Ce code signifie " erreur //
        //System.exit(1);

        //Permet de compter le nombre de Mili-secondes ecoulees depuis le 1/00/1970 - C'est une maniere tres simple d'affcicher la date actuelle //
        long time = System.currentTimeMillis();
        System.out.println(time);

        //Permet de compter le nombre de nano-secondes ecoulees depuis un temps arbitraire - entre deux temps = par exemple entre "start" et "end" - Des ecarts de temps//
        long timeStart = System.nanoTime();
        long timeEnd = System.nanoTime();
        System.out.println(timeEnd - timeStart);

        //Permet de retourner les proprietes de System.out - Affichons les : //
        System.out.println(System.getProperties());

        //  1/2  Permet d'afficher les variables d'environnement a l'utilisateur et au systeme qui m'ont permi de demarrer mon programme, il retourne les variables d'envireonnements connues //
        System.out.println(System.getenv());
        // 2/2 En passant en parametre/en valeur le nom de la valoiable d'environnement pout l'afficher //
        System.out.println(System.getenv("PATH"));

//--------------La Classe Scanner--------------------//

        //Scanner sc = new Scanner(System.in);
       //String ligneSuivante = sc.nextLine();
       //int entierSuivant = sc.nextInt();
       // boolean bolleanSuivante = sc.nextBoolean();

       // System.out.println("La ligne suivante est " + ligneSuivante + ".");
        //System.out.println("La ligne suivante (entier) est " + entierSuivant + ".");
       // System.out.println("La ligne suivante (boolean) est " + bolleanSuivante + ".");


//--------------Les Classes Conteneur ou Wrapper--------------------//


        Integer i2 = new Integer(12);
        Integer i4;
        int i3 = i2.intValue();
        Boolean whats = new Boolean(true);
        Boolean who;
        boolean b1 = Boolean.parseBoolean("TRUE");
        Long longs = new Long(1254L);
        Long longg;
        Character chars = new Character('a');
        Short shorts = new Short("5");
        Double doubl = new Double(2d);
        Float floats = new Float(3.2F);
        Float floatss = new Float("3.2F");
        float f3 = floats.floatValue();
        float f4 = Float.parseFloat("14.2");


//--------------L'auto boxing & l'auto un-boxing--------------------//


        Voiture golf = new Voiture();
        golf.rapportCourant = new Integer(0);
        // L'auto-boxing (manipuler un objet comme un primitif sans utiliser le mot clef "new") permet d'ecrire ceci :
        golf.rapportCourant = 0;
        golf.rapportCourant = golf.rapportCourant.intValue()+1;
        // L'auto-unboxing permet d'ecrire ceci (et donc de convertir le type objet "rapportCourant" en primitif) ==   golf.rapportCourant = golf.rapportCourant+1;
        // on peut utiliser les types dans les deux sens, objet vers primitif ou inversement sans probleme la plupart du temps.
        golf.rapportCourant++;


//--------------La coversion de types--------------------//


    // Je convertis une chaine de caractere en int :
    int i5 = Integer.parseInt("16");

    // Idem pour un boolean :
    Boolean trues = Boolean.parseBoolean("true");

    //L'inverse fonctionne aussi :
    String i6 = String.valueOf(i5);
        System.out.println(i6);

    //Transformer une valeur numerique en une autre, par exemple, un integer en long :
        Integer i8 = new Integer(12);
        long i8AsLong = i8.longValue();


//--------------Les types enumérés --------------------//

    // ------------ AVANT JAVA 5 --------------//
        Voiture audiA4 = new Voiture();
        //audiA4.typeBoite = Voiture.boiteSemiAuto;
        //on peut aussi ecrire comme ceci :
        //audiA4.typeBoite = 2;
        //audiA4.typeBoite=TypeBoiteVitesse.SEMI_AUTO;

    // ------------ DEPUIS JAVA 5 --------------//
        audiA4.typeBoite = TypeBoiteVitesse.SEMI_AUTO;

        System.out.println("Le type de ma boite de vitesse est "+audiA4.typeBoite.nomTypeBoite+".");
        System.out.println(audiA4.typeBoite.ordinal());
        TypeBoiteVitesse semiAuto = TypeBoiteVitesse.valueOf("SEMI_AUTO");
        System.out.println("La boite de vitesse recupérée par le biais de la chaine de caractere est "+semiAuto.nomTypeBoite+".");

        switch (audiA4.typeBoite){
            case AUTO:
                System.out.println("Boite de vitesse = "+TypeBoiteVitesse.AUTO+".");
                break;
            case SEMI_AUTO:
                System.out.println("Boite de vitesse est semi-auto.");
                break;
            case MANUELLE:
                System.out.println("Boite de vitesse est manuelle.");
                break;
        }
        //--------------Les tableaux unidimentionnels --------------------//

        int[] tableauDeInt = new int[5];
        char[] tableauDeChar = new char[5];
        Voiture[] tableauDeVoiture = new Voiture[5];

        tableauDeInt[1] = 15;
        tableauDeInt[4] = 12;

        System.out.println("Le 2eme element du tableau d'entier est "+tableauDeInt[1]);
        System.out.println("Le 2eme element du tableau d'entier est "+tableauDeInt[0]);

        tableauDeVoiture[1] = peugeot206;
        peugeot206.couleur = "vert";
        tableauDeVoiture[4] = new Voiture("rouge");
        System.out.println("Le 2eme element du tableau de voiture est "+tableauDeVoiture[1].couleur);

        System.out.println("La taille du tableau de caractere est "+tableauDeChar.length);

        //---------------Les ellipses ou varargs-------------------------//

      /*
        Passager passager1=new Passager();
        passager1.nom="Jobs";
        passager1.prenom="Steve";

        Ville depart=new Ville();
        depart.nom="Auckland";
        Ville etape1=new Ville();
        etape1.nom="Hamiton";
        Ville etape2=new Ville();
        etape2.nom="Taupo";
        Ville etape3=new Ville();
        etape3.nom="Wellington";

        Ville[] villeEtape=new Ville[3];
        villeEtape[0]=etape1;
        villeEtape[1]=etape2;
        villeEtape[2]=etape3;
        peugeot206.transporter(passager1,depart, villeEtape);
     */
        //Depuis JAVA 5//

        Passager passager1=new Passager();
        passager1.nom="Jobs";
        passager1.prenom="Steve";
        Ville depart=new Ville();
        depart.nom="Auckland";
        Ville etape1=new Ville();
        etape1.nom="Hamiton";
        Ville etape2=new Ville();
        etape2.nom="Taupo";
        Ville etape3=new Ville();
        etape3.nom="Wellington";


        peugeot206.transporter(passager1, depart, etape1, etape2, etape3 );

        HelloWorld hw=new HelloWorld();
        System.out.println(hw.unAttribut);
        hw.quelqueChose();

        System.out.println("Hello "+args[0]);


        int [][] tableauEntier = new int[5][3];
        tableauEntier[1][2]=12;
        System.out.println("Tableau?");
        for(int col=0;col<tableauEntier.length;col++) {
            for (int lignes = 0; lignes < tableauEntier[col].length; lignes++) {
                System.out.println("L'element contenu a la position " + col + "," + lignes + " vaut " + tableauEntier[col][lignes]);
            }


/*      char[][][][] tableauChar = new char[5][3][10][2];
        tableauChar[1][2][6][1]='a';
        for(int col=0;col<tableauEntier.length;col++){
            for(int lignes=0;lignes<tableauEntier[col].length;lignes++) {
                for (int col2 = 0; col2 < tableauEntier.length; col2++) {
                    for (int lignes2 = 0; lignes2 < tableauEntier[col2].length; lignes2++) {
                        System.out.println("L'element contenu a la position "+col+","+lignes+","+col2+","+lignes2+" vaut "+tableauChar[col][lignes][col2][lignes2]);
                    }
                }
            }
        }
*/

        }


///////--------------------------LES COLLECTIONS-------------------------------------------------------//


        // --Les "List"--

        //ArrayList list=new ArrayList();
  

        Voiture golf4=new Voiture();
        Voiture golf6=new Voiture();

        List<Voiture> list=new ArrayList();

        golf4.couleur="Grise";
        list.add(golf4); //index 0
        list.add(golf6);
        //list.add(3); //index 1 pas un int mais un Int
        list.add(golf4); //index 2, possible de dupliquer des elements


        //list.remove(golf4); //va supprimer le premier objet recontre dans la list

        //list.add(3); //index 0 pas un int mais un Int
        list.add(golf4); //index 1, possible de dupliquer des elements

        Voiture o=list.get(0);
        //System.out.println("L'objet à l'index 0 est "+o+".");
        System.out.println("La voiture à l'index 0 est de couleur "+o.couleur+".");

        // --Les "Set"-- Ne peut contenir 2 elements identiques
        Voiture peugeot207 = new Voiture("noir");

        Set<Voiture> set = new HashSet<>();
        set.add(peugeot206);
        set.add(peugeot207);
        set.add(peugeot206); // puisque theoriquement impossible de creer des doublons dans un "set", Java va l'ignorer

        for (Voiture voiture : set){
            System.out.println(voiture.couleur);
        }

        //Ou methode ancienne :

        Iterator<Voiture> it = set.iterator();
        Voiture v = it.next(); // selectionne/itere/affiche la suivante, dans ce cas la premiere
        System.out.println(v.couleur);

        //"it.hasNext()" renvoie vrai??? si un element est present lors de la prochaine iteration
        //En general on ecrit :
            while(it.hasNext()){
                Voiture vo = it.next();
                System.out.println(vo.couleur);
            }


        System.out.println(set.size()); // ".size" nous donne la taille du tableau "set", ici le doublon est ignoré


        // -- "foreach" -- itérer sur une collection (voir ci-dessus)



                //----NothingI = branche Jnesis par default--

    }
}