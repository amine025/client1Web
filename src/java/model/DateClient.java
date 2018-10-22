package model;

public class DateClient {

    String annee;
    String mois;
    String jour;

    public DateClient(String annee, String mois, String jour) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
    }

    public String getAnnee() {
        return annee;
    }

    public String getMois() {
        return mois;
    }

    public String getJour() {
        return jour;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }
}
