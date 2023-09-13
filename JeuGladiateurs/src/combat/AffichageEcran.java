package combat;

import personnages.Personnage;

public class AffichageEcran {

    public void afficherDebutCombat() {
        System.out.println("");
        System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>> Que le combat commence! <<<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
        System.out.println("");
    }

    public void afficherSeparateurDeTour() {
        System.out.println("");
        System.out.println("**************************************");
    }

    public void afficherSeparateurInfosPerso() {
        System.out.println("");
        System.out.println("------------------");
        System.out.println("INFOS PERSONNAGES");
        System.out.println("------------------");
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        if (personnage1.getPointsDeVie() == 0) {
            System.out.println("Igor l'empaleur gagne le combat !!");
            System.out.println("");
        } else {
            System.out.println("Bob le malchanceux gagne le combat !!");
            System.out.println("");
        }
    }
    // </editor-fold>
}
