package personnages;

import java.util.Random;
import java.util.logging.Logger;

public class rétiaire extends Personnage {

    protected String classe;
    boolean filet = true;

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public rétiaire() {
        this.classe = "";
    }

    public rétiaire(String classe, String nom, int attaqueMax, int defense, int pvs, int ini) {
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
        if (filet == true) {
            System.out.println("");
            System.out.println("Igor l'empaleur lance son filet");

            Random igorRand = new Random();
            int minValue1 = 0;
            int maxValue1 = 10 + 1;
            int nombreAleatoire1 = igorRand.nextInt(maxValue1 - minValue1) + minValue1;
            
            Random bobRand = new Random();
            int minValue2 = 0;
            int maxValue2 = 10 + 1;
            int nombreAleatoire2 = bobRand.nextInt(maxValue2 - minValue2) + minValue2;
      
            if (nombreAleatoire1 == nombreAleatoire2) {
                System.out.println("Son filet attrape Bob le malchanceux et il l empale sauvagement avec sa lance");
                personnageCible.pointsDeVie = 0;
            } else {
                filet = false;
                System.out.println("Le filet n'atteint pas sa cible");
            }
        } else {
            filet = true;
            if (nbAttaque - nbDefense <= 0) {
                degat = 0;
            } else {
                degat = nbAttaque - nbDefense;
            }
            if (personnageCible.pointsDeVie - degat <= 0) {
                personnageCible.pointsDeVie = 0;
            } else {
                personnageCible.pointsDeVie -= degat;
            }
            System.out.println("");
            System.out.println(nom + " attaque avec une puissance de : " + nbAttaque);
            System.out.println(personnageCible.nom + " a une defense de : " + nbDefense);
            System.out.println("Les dommages sont donc de : " + degat);
        }
    }
}
