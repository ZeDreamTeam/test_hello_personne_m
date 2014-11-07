package perso;

import stuff.Publication;

/**
 * Created by goubin on 07/11/14.
 */
public interface IChercheur {
    public void ajouterPublication (Publication p);
    public String listerPublications();
}
