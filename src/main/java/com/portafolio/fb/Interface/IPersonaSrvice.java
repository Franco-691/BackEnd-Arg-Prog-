
package com.portafolio.fb.Interface;

import com.portafolio.fb.Entity.Persona;
import java.util.List;

public interface IPersonaSrvice {
public List<Persona>  getPersona();  
public void savePersona(Persona persona);
public void deletePersona(Long id);
public Persona findPersona(Long id);

}
