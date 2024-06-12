package org.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VoitureTest {
    



    @Test
    public void testConstructor() {
        Voiture voiture = new Voiture(20000.0f, "Toyota");
        assertEquals(20000.0f, voiture.getPrix());
        assertEquals("Toyota", voiture.getMarque());
    }

    @Test
    public void testGettersAndSetters() {
        Voiture voiture = new Voiture(0.0f, "");
        voiture.setPrix(15000.0f);
        voiture.setMarque("Honda");
        assertAll("Testing getters and setters",
            () -> assertEquals(15000.0f, voiture.getPrix(), "Prix devrait être 15000.0f"),
            () -> assertEquals("Honda", voiture.getMarque(), "Marque devrait être Honda")
        );
    }

    @Test
    public void testToString() {
        Voiture voiture = new Voiture(25000.0f, "Ford");
        String expected = "{ prix='25000.0', marque='Ford'}";
        assertEquals(expected, voiture.toString());
    }


}
