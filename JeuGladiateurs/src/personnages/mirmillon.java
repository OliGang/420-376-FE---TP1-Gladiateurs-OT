package personnages;

import java.util.Random;
import java.util.logging.Logger;

public class mirmillon extends Personnage {

    protected String classe;

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public mirmillon() {
        this.classe = "";
    }

    public mirmillon(String classe, String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        this.classe = classe;
    }

    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("    Classe : " + this.classe);
    }

    private int attaqueCalcul() {
        Random rand1 = new Random();
        int minValue1 = 0;
        int maxValue1 = valeurMaxAttaque + 1;
        int nombreAleatoire1 = rand1.nextInt(maxValue1 - minValue1) + minValue1;
        return nombreAleatoire1;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int nbAttaque = attaqueCalcul();
        int nbDefense = personnageCible.getValeurDefense();
        int degat;
        if (nbAttaque - nbDefense <= 0) {
            degat = 0;
        } else {
            degat = nbAttaque - nbDefense;
        }
        if (personnageCible.pointsDeVie - degat <= 0) {
            personnageCible.pointsDeVie = 0;
            System.out.println("");
            System.out.println(nom + " attaque avec une puissance de : " + nbAttaque);
            System.out.println(personnageCible.nom + " a une defense de : " + nbDefense);
            System.out.println("Il décapite son adversaire!");
        } else {
            personnageCible.pointsDeVie -= degat;
            System.out.println("");
            System.out.println(nom + " attaque avec une puissance de : " + nbAttaque);
            System.out.println(personnageCible.nom + " a une defense de : " + nbDefense);
            System.out.println("Les dommages sont donc de : " + degat);
            nbAttaque = attaqueCalcul();
            nbDefense = personnageCible.getValeurDefense();
            if (nbAttaque - nbDefense <= 0) {
                degat = 0;
            } else {
                degat = nbAttaque - nbDefense;
            }
            if (personnageCible.pointsDeVie - degat <= 0) {
                personnageCible.pointsDeVie = 0;
                System.out.println("");
                System.out.println(nom + " attaque avec une puissance de : " + nbAttaque);
                System.out.println(personnageCible.nom + " a une defense de : " + nbDefense);
                System.out.println("Les dommages sont donc de : " + degat);
            } else {
                personnageCible.pointsDeVie -= degat;
                System.out.println("");
                System.out.println(nom + " attaque avec une puissance de : " + nbAttaque);
                System.out.println(personnageCible.nom + " a une defense de : " + nbDefense);
                System.out.println("Les dommages sont donc de : " + degat);
            }
        }
    }
    
    public void setNewInitiativeRandom() {
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 30 + 1;
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        initiative = nombreAleatoire;
    }
}
