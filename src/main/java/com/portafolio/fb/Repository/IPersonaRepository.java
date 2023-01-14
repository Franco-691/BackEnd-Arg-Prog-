
package com.portafolio.fb.Repository;

import com.portafolio.fb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
