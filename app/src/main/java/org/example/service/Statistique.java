package org.example.service;

import org.example.Voiture;

public interface Statistique {

    public void ajouter(Voiture voiture);

    /**
     *
     * @return
     * @throws ArithmeticException s'il n'y a pas de voiture
     */
    public float prixMoyen() throws ArithmeticException;

}
