import gui.Fenetre;
import perso.*;
import stuff.Publication;

import java.util.ArrayList;
import java.util.List;

public class HelloPersonnes {
    public static void main(String[] args) {
        List<Personne> pers = new ArrayList<Personne>();
        EnseignantChercheur chercheur = EnseignantChercheurFactory.get("tom", "Sawyer", 35, 192);
        chercheur.ajouterPublication(new Publication("La conception objet",2003));
        chercheur.ajouterPublication(new Publication("La programmation objet",2004));
        pers.add(chercheur);
        // printing the object attributes
        System.out.println(chercheur);
        Fenetre f = new Fenetre(pers);
    }
}