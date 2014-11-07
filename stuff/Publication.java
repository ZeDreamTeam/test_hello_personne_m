package stuff;

/**
 * Describe a Publication that can be used by Object implementing IChercheur
 * Created by goubin on 07/11/14.
 */
public class Publication
{
    private String titre;
    private int annee;

    public Publication(String titre, int annee) {
        this.titre=titre;
        this.annee=annee;
    }
    public String getTitre() {
        return titre;
    }
    public int getAnnee() {
        return annee;
    }
    public String toString() {
        return getTitre()+"/"+getAnnee();
    }

}
