package pe.edu.tecsup.springbootapp.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SaludoENImpl implements Saludo{
    @Override
    public String dia(String nombres) {
        return "Good morning " + nombres;
    }

    @Override
    public String tarde(String nombres) {
        return "Good afternoon " + nombres;
    }

    @Override
    public String noche(String nombres) {
        return "Good evening " + nombres;
    }
}
