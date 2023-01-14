
package com.portafolio.fb.Security.Repository;

import com.portafolio.fb.Security.Entity.Rol;
import com.portafolio.fb.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository <Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
