import perso.*;

public class HelloPersonnes {
    public static void main(String[] args) {
        Personne p = new Personne("Lannister", "Jamie", 24);
        Personne en = new Enseignant("Jones", "Indiana", 99, 0);
        Personne et = new Etudiant("Cartman", "Eric", 9, 3);
        System.out.println(p.toString() + "\n" + en.toString() + "\n" + et.toString());


    }
}