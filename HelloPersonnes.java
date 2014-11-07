import perso.*;

public class HelloPersonnes {
    public static void main(String[] args) {
        Personne p[] = new Personne[3];
        p[0] = new Personne("Lannister", "Jamie", 24);
        p[1] = new Enseignant("Jones", "Indiana", 99, 0);
        p[2] = new Etudiant("Cartman", "Eric", 9, 3);
        for(Personne personne : p) {
            System.out.println(personne.toString());
        }
    }
}