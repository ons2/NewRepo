package tn.tuniprob.gestionmagasin;

import GestionEmployee.Employe;

public class Magasin {

    public int id;
    public String nom;
    public String adresse;
    public int capMag;
    Produit[] produits;
    public int nbProduit = 0;
    private final int EMP_MAX = 20;
    private Employe[] empTab = new Employe[EMP_MAX];

    static int totalProduits;

    public Magasin(int id, String nom, String adresse, int capMag){
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.capMag = capMag;
    }

    public Magasin(){}

    public String toString (){
        return ("Caractéristiques du magasin : "
                + "\n Identifiant  : " + id
                + "\n Nom : " + nom
                + "\n Adresse : " + adresse
                + "\n Capacité : " + capMag
                + "\n"
        );
    }

    public Boolean chercherProduit (Produit p){
        for(Produit produit : produits) {
            if (produit.comparer(p))
                return true;
        }
        return false;
    }

    public void ajouterProduit (Produit p){
        if (nbProduit < capMag){
            if (!chercherProduit(p)){
                produits[nbProduit] = p;
                nbProduit++;
                System.out.println("Produit ajouté");
                totalProduits ++;
            }
            else
                System.out.println("Produit existant");
        } else {
            System.out.println("Magasin plein");
        }
    }

    public void supprimerProduit (Produit p){
        if(chercherProduit(p)){
            p = new Produit();
            for (int i=0; i<produits.length; i++){
            }

        }
     }

    public Magasin magSup (Magasin m1, Magasin m2) {
        if (m1.produits.length > m2.produits.length)
            return m1;
        else
            return m2;
    }

    public static int getTotalProduits (){
        return totalProduits;
    }

    //Création de magasins
    //Magasin magasin1 = new Magasin(1, "Carrefour", "Ezzahra");

    /*public String toString(){
       //pour afficher tab prod
       string str ="";
       for(int i=0; i<nbProduit; i++)
           str+= "" + produits[i];

    }*/

    /*public static Magasin plusProduit (Magasin m1, Magasin m2){
        if
    }*/

   /* public int recherchIndice(Produit p){
        for(int i=0; i<nbProduit; i++)
            if(Produit.comparer)
    }*/





}
