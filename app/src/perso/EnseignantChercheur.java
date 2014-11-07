package perso;

import stuff.Publication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by goubin on 07/11/14.
 */
public class EnseignantChercheur extends Enseignant implements IChercheur {
    private final List<Publication> publicationList;
    public EnseignantChercheur(String nom, String prenom, int age, int hours) {
        super(nom, prenom, age, hours);
        publicationList = new ArrayList<Publication>();
    }

    @Override
    public void ajouterPublication(Publication p) {
        if(publicationList.size()==10)
            throw new IllegalStateException("The publication list already contains 10 publication");
        publicationList.add(p);
    }

    @Override
    public String listerPublications() {
        StringBuilder builder = new StringBuilder();
        for (Publication publication : publicationList) {
            builder.append(publication.toString()).append(", ");
        }
        if(builder.length()!=0) builder.setLength(builder.length()-2);
        return builder.toString();
    }

    @Override
    public String toString() {
        return "arraylist: " + super.toString() + " Publication: " + listerPublications() ;
    }
}
