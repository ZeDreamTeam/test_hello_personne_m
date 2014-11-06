package perso;

public class Enseignant extends Personne {
    private int hours;

    public Enseignant(String nom, String prenom, int age, int hours) {
        super(nom,prenom,age);
        this.hours = hours;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours=hours;
    }

}