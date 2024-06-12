package org.example.service;

import java.util.ArrayList;

import org.example.Voiture;

public class Echantillon implements Statistique {
    
    ArrayList<Voiture> echantillons; 


    public Echantillon(ArrayList<Voiture> echantillons) {
        this.echantillons = echantillons;
    }
    
    @Override
    public void ajouter(Voiture voiture)
    {
        this.echantillons.add(voiture);

    };


    public ArrayList<Voiture> getEchantillons() {
        return this.echantillons;
    }

    
    @Override
    public float prixMoyen()
    throws ArithmeticException
    {
        if(this.getEchantillons().isEmpty())
        {
            throw new ArithmeticException("L'échantillon est vide");

        }
        float somme = 0 ; 
        for(int i= 0 ; i<this.getEchantillons().size();i++)
        {
           somme  = somme + this.getEchantillons().get(i).getPrix() ;
        
        }
        return somme/this.getEchantillons().size(); 
    };
    


}


