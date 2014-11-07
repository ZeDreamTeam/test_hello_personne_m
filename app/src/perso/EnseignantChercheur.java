package perso;

import stuff.Publication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by goubin on 07/11/14.
 */
public abstract class EnseignantChercheur extends Enseignant implements IChercheur {

    public EnseignantChercheur(String nom, String prenom, int age, int hours) {
        super(nom, prenom, age, hours);
    }
}
