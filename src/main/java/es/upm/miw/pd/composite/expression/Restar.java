package es.upm.miw.pd.composite.expression;

public class Restar extends Operacion {

    public Restar(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public String toString() {
        return "(" + expresion1 + "-" + expresion2 + ")";
    }

    @Override
    public int operar() {
        return expresion1.operar() - expresion2.operar();
    }
}
