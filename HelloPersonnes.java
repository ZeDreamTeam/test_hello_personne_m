import perso.*;
import stuff.Publication;

public class HelloPersonnes {
    public static void main(String[] args) {
        IChercheur chercheur = new EnseignantChercheur("tom", "Sawyer", 35,192);
        chercheur.ajouterPublication(new Publication("La conception objet",2003));
        chercheur.ajouterPublication(new Publication("La programmation objet",2004));

        // printing the object attributes
        System.out.println(chercheur);
    }
}