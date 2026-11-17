package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe de test pour SubtractOperation.
 */
public class SubtractOperationTest {

    /**
     * Teste la méthode de soustraction.
     */
    @Test
    public void testSubtract() {
        final Operation op = new SubtractOperation();
        final double expected = 2.0;
        final double a = 5.0;
        final double b = 3.0;
        final double delta = 0.001;

        assertEquals(expected, op.calculer(a, b), delta);
    }
}