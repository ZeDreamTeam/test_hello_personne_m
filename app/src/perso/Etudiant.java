package perso;


public class Etudiant extends Personne{
    private int note;

    public Etudiant(String nom, String prenom, int age, int note) {
        super(nom,prenom,age);
        this.note =note;
    }
    public int getNote() {
        return this.note;
    }

    public void setNote(int note) {
        this.note=note;
    }

    public String toString() {
        return super.toString() + " - " + getNote() + "/10";
    }

}