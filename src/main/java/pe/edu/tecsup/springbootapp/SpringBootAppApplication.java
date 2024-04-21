package pe.edu.tecsup.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.tecsup.springbootapp.beans.Calculadora;
import pe.edu.tecsup.springbootapp.beans.Saludo;

import java.util.Calendar;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringBootAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppApplication.class, args);
    }

    /*  //  FORM 1 DE INYECCION
    /*  //  FORM 1 DE INYECCION
    @Autowired
    Calculadora calculadora;

    @Autowired
    Saludo saludo;

    //*/

    //*  //  FORM 2 DE INYECCION
    final Calculadora calculadora;

    final Saludo saludo;

    public SpringBootAppApplication(Calculadora calculadora, Saludo saludo) {
        this.calculadora = calculadora;
        this.saludo = saludo;
    }

    //*/

    @Override
    public void run(String... args) throws Exception {
        log.info("Hola Mundo con Spring Boot!");

        Double resultado = calculadora.sumar(15.0, 5.0);
        log.info("Resultado: " + resultado);

        String nombres = "Juan Flores";

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        log.info("hour: " + hour);

        String mensaje;
        if(hour < 12) {
            mensaje = saludo.dia(nombres);
        } else if(12 <= hour && hour < 19) {
            mensaje = saludo.tarde(nombres);
        } else {
            mensaje = saludo.noche(nombres);
        }
        log.info("Resultado: " + mensaje);

    }
}

