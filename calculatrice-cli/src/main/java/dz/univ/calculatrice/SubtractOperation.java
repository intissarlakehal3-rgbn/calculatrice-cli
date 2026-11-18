package dz.univ.calculatrice;

public class SubtractOperation implements Operation {
    @Override
    public double calculer(final double a, final double b) {
        return a - b;
    }
}