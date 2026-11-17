package dz.univ.calculatrice;
/**
Classe représentant l'opération d'addition.
*/
public final class AddOperation implements Operation {
@Override
public double calculer(final double a, final double b) {
return a + b;
}
}
