import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.Produit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nbMag;
        int nbTotalProd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de vos magasins : ");
        nbMag = scanner.nextInt();
        Magasin[] tuniProdMag = new Magasin[nbMag];

        for(int i=0; i<nbMag; i++) {

            int nbProduit;
            int id;
            String adr;
            Magasin monMagasin = new Magasin();
            System.out.println("Id : ");
            id = scanner.nextInt();
            System.out.println("Adresse : ");
            adr = scanner.next();
            monMagasin.id = id;
            monMagasin.adresse = adr;

            System.out.println("Entrer le nombre de produit sans dépassant !!50 aricles!! : ");
            do {
                nbProduit = scanner.nextInt();
                if (nbProduit > 50)
                    System.out.println("Réessayer d'entrer un autre nombre de produit : ");
            } while (nbProduit > 50);
            monMagasin.capMag = nbProduit;

            Produit[] produits = new Produit[nbProduit];
            for (int j = 0; j < nbProduit; j++) {
                Produit p = new Produit();
                p.ajoutProduit();
                produits[j] = p;
            }

            System.out.println("\n");
            System.out.println(monMagasin.toString() + " Produits :");
            for (int j = 0; j < nbProduit; j++) {
                System.out.println("Nom : " + produits[j].lib
                        + "\nPrix :" + produits[j].prix);
            }
            tuniProdMag[i] = monMagasin;
            nbTotalProd = nbTotalProd + nbProduit;
        }

        System.out.println("Le nombre total de tous les produits dans tous les magasins : " + nbTotalProd);



    }
}