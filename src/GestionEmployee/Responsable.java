package GestionEmployee;

public class Responsable extends Employe {

    private double prime;

    public Responsable(int id, String nom, String adress, int nbHeurs, double prime){
        super(id, nom, adress, nbHeurs);
        this.prime = prime;
    }

    public Responsable(){}

    public String toString() {
        return "Responsable : " + super.toString() + " " + this.prime;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }
}
