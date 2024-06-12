package org.example;


public class Voiture {
    


    float prix; 
    String marque ; 


    public Voiture(float prix, String marque) {
        this.prix = prix;
        this.marque = marque;
    }


    public float getPrix() {
        return this.prix;
    }

    public void setPrix(float prix) {

        this.prix = prix;

    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "{" +
            " prix='" + getPrix() + "'" +
            ", marque='" + getMarque() + "'" +
            "}";
    }

}
