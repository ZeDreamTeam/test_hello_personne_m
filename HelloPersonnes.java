import perso.*;

public class HelloPersonnes {
    public static void main(String[] args) {
        Personne p = new Personne("Lannister", "Jamie", 24);
        Enseignant en = new Enseignant("Jones", "Indiana", 99, 0);
        Etudiant et = new Etudiant("Cartman", "Eric", 9, 3);

        System.out.println("Personne: " + p.getNom() + " " + p.getPrenom() + " - " + p.getAge() + " years old");
        System.out.println("Enseignant: " + en.getNom() + " " + en.getPrenom() + " - " + en.getAge() + " years old" + " - " + en.getHours() + " per week");
        System.out.println("Etudiant: " + et.getNom() + " " + et.getPrenom() + " - " + et.getAge() + " years old" + " - " + et.getNote() + "/10");


    }
}