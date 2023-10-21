package GestionEmployee;

public class Employe {

    private int id;
    private String nom;
    private String adress;
    private int nbHeurs;

    public Employe(int id, String nom, String adress, int nbHeurs) {
        this.id = id;
        this.nom = nom;
        this.adress = adress;
        this.nbHeurs = nbHeurs;
    }

    public Employe() {
    }

    public String toString() {
        return this.id + " " + this.nom + " " + this.adress + " " + this.nbHeurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNbHeurs() {
        return nbHeurs;
    }

    public void setNbHeurs(int nbHeurs) {
        this.nbHeurs = nbHeurs;
    }


}
