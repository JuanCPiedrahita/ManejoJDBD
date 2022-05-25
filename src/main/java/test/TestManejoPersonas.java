
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
       List<Persona> personas = personaDao.seleccionar();
       for(Persona persona: personas){
           System.out.println("persona = " + persona);
       }
        
    }
    
}
