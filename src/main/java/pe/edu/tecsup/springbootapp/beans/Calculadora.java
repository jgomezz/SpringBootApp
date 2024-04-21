package pe.edu.tecsup.springbootapp.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public Double sumar(Double a, Double b) {
        return a + b;
    }

    public Double restar(Double a, Double b) {
        return a - b;
    }

    public Double multiplicar(Double a, Double b) {
        return a * b;
    }

    public Double dividir(Double a, Double b) {
        if (b == 0)
            return (a < 0) ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        return a / b;
    }

}
