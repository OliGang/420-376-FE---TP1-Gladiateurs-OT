package personnages;

import java.util.logging.Logger;

public class mirmillon extends Personnage {
    
    private String classe;

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
    
}
