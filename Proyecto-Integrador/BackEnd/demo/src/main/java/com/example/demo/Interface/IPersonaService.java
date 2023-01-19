
package com.example.demo.Interface;

import com.example.demo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    
    public void savePersona(Persona persona);
    
    //Eliminar un usuario pero se lo busca por id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    
    public Persona findPersona(Long id);
}
