package GestionEmployee;

public class Caissier extends Employe {
    private double numDeCaisse;

    public Caissier(int id, String nom, String adress, int nbHeurs, double numDeCaisse) {
        super(id, nom, adress, nbHeurs);
        this.numDeCaisse = numDeCaisse;
    }

    public Caissier(){}

    public String toString() {
        return super.toString() + " " + this.numDeCaisse;
    }

    public double getNumDeCaisse() {
        return numDeCaisse;
    }

    public void setNumDeCaisse(double numDeCaisse) {
        this.numDeCaisse = numDeCaisse;
    }

    public static class Responsable extends Employe {
        private double prime;

        public Responsable(int id, String nom, String adress, int nbHeurs, double prime) {
            super(id, nom, adress, nbHeurs);
            this.prime = prime;
        }

        public Responsable() {
        }

        public String toString() {
            return super.toString() + " " + this.prime;
        }

        public double getPrime() {
            return prime;
        }

        public void setPrime(double prime) {
            this.prime = prime;
        }
    }
}
