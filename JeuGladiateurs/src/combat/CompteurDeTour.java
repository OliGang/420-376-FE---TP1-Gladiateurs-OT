package combat;

public class CompteurDeTour {

    int cptrTour;
    
    public CompteurDeTour() {
        cptrTour = 1;
    }
    
    public int getCptrTour() {    
        return cptrTour;
    }

    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }
    
    public void augmenteTour() {
        cptrTour += 1;
    }

    public void afficheTour() {
        System.out.println("----------------");
        System.out.println("TOUR ACTUEL : " + cptrTour);
        System.out.println("----------------");
    }
}
