package perso;

/**
 * Created by goubin on 07/11/14.
 */
public class EnseignantChercheurFactory {
    public static IChercheur get(String nom, String prenom, int age, int hours) {
        if(System.getProperty("os.name").contains("windows")) {
            return new EnseignantChercheurSet(nom,prenom,age,hours);
        }
        return new EnseignantChercheur(nom,prenom,age,hours);
    }
}
