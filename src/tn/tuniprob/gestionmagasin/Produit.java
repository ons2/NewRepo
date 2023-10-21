package tn.tuniprob.gestionmagasin;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Produit {
    public int id;
    public String lib;
    public String marque;
    public double prix;
    public Date dateExp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if(prix>0)
             this.prix = prix;
        else
            System.out.println("Le prix doit etre positif");
    }

    public Date getDateExp() {
        return dateExp;
    }

    public void setDateExp(Date dateExp) {
        this.dateExp = dateExp;
    }

    public Produit (int id, String lib, String marque, double prix, Date dateExp){
        this.id = id;
        this.lib = lib;
        this.marque = marque;
        this.prix = prix;
        this.dateExp = dateExp;
    }

    public Produit(){}

    public String toString (){
        return ("Détail du produit " + id + " :"
                + "\n Libellé : " + lib
                + "\n Marque : " + marque
                + "\n Prix : " + prix
                + "\n Date Expiration : " + dateExp
                + "\n"
                 );
    }
    
    public Produit ajoutProduit (){
        Produit produit = new Produit();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ajouter un nouveau produit :");
        System.out.println("-----------------");
        System.out.println("Id : ");
        produit.id = scanner.nextInt();
        System.out.println("Libellé : ");
        produit.lib = scanner.next();
        System.out.println("Marque : ");
        produit.marque = scanner.next();
        do{
            System.out.println("Prix : ");
            produit.prix = scanner.nextDouble();
        }while (prix < 0);
        produit.dateExp = new Date();
        this.id = produit.id;
        this.lib = produit.lib;
        this.prix = produit.prix;
        this.marque = produit.marque;
        this.dateExp = produit.dateExp;
        return produit;
    }

    public Boolean comparer (Produit p1, Produit p2){
        if ((p1.id == p2.id) || ((p1.lib).equals(p2.lib)) && (p1.prix == p2.prix))
            return true;
        else
            return false;
    }

    public Boolean comparer (Produit p){
        return  this.id == p.id ||
                (this.lib).equals(p.lib) &&
                this.prix == p.prix;
    }



}
