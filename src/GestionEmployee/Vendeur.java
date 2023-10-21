package GestionEmployee;

import GestionEmployee.Employe;

public class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(int id, String nom, String adress, int nbHeurs, double tauxDeVente) {
        super(id, nom, adress, nbHeurs);
        this.tauxDeVente = tauxDeVente;
    }

    public Vendeur() {
    }

    public String toString() {
        return super.toString() + " " + this.tauxDeVente;
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }
}
