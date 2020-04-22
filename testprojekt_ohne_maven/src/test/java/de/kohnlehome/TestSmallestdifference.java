package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;


public class TestSmallestdifference {
    private MyInterface myInterface;



    @Test
    public void test(){
        // ===== ACT =====
        // zu testende Methode aufrufen
        int x = myInterface.method(3);

        // ===== ASSERT =====
        // Überprüfen, ob Methode richtigen Wert zurückgibt
        assertThat(x).isEqualTo(7);

        // Überprüfen, ob Methoden des Testdoubles aufgerufen wurden
        verify(myInterface).method(3);
    }
}