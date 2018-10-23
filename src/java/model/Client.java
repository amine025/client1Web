
package model;

public class Client {
    String nom;
    String prenom;
    int ddn;

    public Client(String nom, String prenom, int ddn) {
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = ddn;
        
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getDdn() {
        return ddn;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDdn(int ddn) {
        this.ddn = ddn;
    }  
}
