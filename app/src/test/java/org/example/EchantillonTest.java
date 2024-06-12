package org.example;

import java.util.ArrayList;

import org.example.service.Echantillon;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EchantillonTest {
    
    private Echantillon echantillon ; 

    @BeforeEach
    public void setUp() {
        echantillon = new Echantillon(new ArrayList<>());
    }

    @Test
    public void testAjouter() {
        Voiture voiture = new Voiture(95400.0f, "Audi");
        echantillon.ajouter(voiture);

        assertFalse(echantillon.getEchantillons().isEmpty(), "L'échantillon ne devrait pas être vide après avoir ajouté une voiture");
        assertEquals(1, echantillon.getEchantillons().size(), "La taille doit être de 1 ");
        assertEquals(voiture, echantillon.getEchantillons().get(0), "La voiture ajoutée doit être celle de l'échantillon");
    }

    @Test
    public void testPrixMoyen() {
        echantillon.ajouter(new Voiture(20000.0f, "BMW"));
        echantillon.ajouter(new Voiture(30000.0f, "Mercedes"));
        echantillon.ajouter(new Voiture(25000.0f, "MG"));

        float expectedPrixMoyen = (20000.0f + 30000.0f + 25000.0f) / 3;
        assertEquals(expectedPrixMoyen, echantillon.prixMoyen(), 0.001, "Moyenne correcte");
    }

    @Test
    public void testPrixMoyenEchantillonVide() {
        assertThrows(ArithmeticException.class, () -> echantillon.prixMoyen(), "Devrait retourner une exception car echantillon vide");
    }

    

   
}
