package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Personnage Bob = new Personnage("Bob le malchanceux", 15, 15, 70, 15);
        Personnage Igor = new Personnage("Igor l'empaleur", 25, 5, 100, 30);
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        Bob.afficherInfosPersonnage();
        Igor.afficherInfosPersonnage();
        affichage.afficherDebutCombat();
        // </editor-fold>
        tour.afficheTour();
        for (int i = 0; i < 100; i++) {
            if (Bob.getInitiative() == i) {
                Bob.frapperPersonnage(Igor);
            } else if (Igor.getInitiative() == i) {
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

        // TODO : Après la boucle, afficher le résultat du combat
        // </editor-fold>
    }

}
