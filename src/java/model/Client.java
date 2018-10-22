
package model;

public class Client {
    String nom;
    String prenom;
    DateClient ddn;

    public Client(String nom, String prenom, DateClient ddn) {
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

    public DateClient getDdn() {
        return ddn;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDdn(DateClient ddn) {
        this.ddn = ddn;
    }  
}
