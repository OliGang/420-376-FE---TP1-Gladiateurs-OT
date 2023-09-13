package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.mirmillon;
import personnages.rétiaire;

public class JeuGladiateurs {

    public static void main(String[] args) {

        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Personnage Bob = new mirmillon("Mirmillon", "Bob le malchanceux", 15, 15, 70, 15);
        Personnage Igor = new rétiaire("Retiaire", "Igor l'empaleur", 25, 5, 100, 30);
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        Bob.afficherInfosPersonnage();
        Igor.afficherInfosPersonnage();
        affichage.afficherDebutCombat();
        // </editor-fold>
        for (int i = 0; i < 50; i++) {
            if (Bob.getPointsDeVie() <= 0 || Igor.getPointsDeVie() <= 0) {
                System.out.println("");
                i = 50;
            } else {
                tour.afficheTour();
                for (int j = 0; j < 100; j++) {
                    if (Bob.getInitiative() == j) {
                        Bob.frapperPersonnage(Igor);
                    } else if (Igor.getInitiative() == j) {
                        Igor.frapperPersonnage(Bob);
                    }
                }
                affichage.afficherSeparateurInfosPerso();
                Bob.afficherInfosPersonnage();
                Igor.afficherInfosPersonnage();
                Bob.setNewInitiativeRandom();
                Igor.setNewInitiativeRandom();
                tour.augmenteTour();
                affichage.afficherSeparateurDeTour();
            }
        }
        affichage.afficheVictoire(Bob, Igor);
        // </editor-fold>
    }

}
