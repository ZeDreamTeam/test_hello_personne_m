package perso;


public class Personne {
    private final String nom;
    private final String prenom;
    private final int age;

    public Personne(String nom, String prenom, int age) {
        this.nom=nom;
        this.age =age;
        this.prenom = prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }
    public int getAge() {
        return this.age;
    }

    public String toString() {
        return getNom() + " " + getPrenom() + " - " + getAge() + " years old";

    }


}