package personnages;

import java.util.Random;
import personnages.mirmillon;
import personnages.rétiaire;

public class Personnage {

    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;

    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        pointsDeVie = pvs;
        valeurMaxAttaque = attaqueMax;
        valeurDefense = defense;
        initiative = ini;
    }

    public Personnage() {
        nom = "";
        pointsDeVie = 0;
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        initiative =0;
    }

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public int getInitiative() {    
        return initiative;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }
    
    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }
    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("");
        System.out.println(nom);
        System.out.println("    Attaque : " + valeurMaxAttaque);
        System.out.println("    Defense : " + valeurDefense);
        System.out.println("    Points de vie : " + pointsDeVie);
        System.out.println("    Initiative : " + initiative);
        if (pointsDeVie <= 0) {
            System.out.println("    Statut : Mort");
        } else {
            System.out.println("    Statut : Vivant");
        }
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
        } else {
            personnageCible.pointsDeVie -= degat;
        }
        System.out.println("");
        System.out.println(nom + " attaque avec une puissance de : " + nbAttaque);
        System.out.println(personnageCible.nom + " a une defense de : " + nbDefense);
        System.out.println("Les dommages sont donc de : " + degat);
    }

    public void setNewInitiativeRandom() {
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 100 + 1;
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        initiative = nombreAleatoire;
    }
    // </editor-fold>
}
