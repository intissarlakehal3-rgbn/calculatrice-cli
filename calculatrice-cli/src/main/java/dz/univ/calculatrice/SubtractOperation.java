package dz.univ.calculatrice;

/**
 * Représente l'opération mathématique de soustraction.
 */
public class SubtractOperation implements Operation {

    /**
     * Calcule la différence entre deux nombres.
     *
     * @param a le premier opérande
     * @param b le second opérande à soustraire
     * @return le résultat de a - b
     */
    @Override
    public double calculer(final double a, final double b) {
        return a - b;
    }
}