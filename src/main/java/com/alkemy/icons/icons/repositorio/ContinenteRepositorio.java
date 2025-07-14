
package com.alkemy.icons.icons.repositorio;

import com.alkemy.icons.icons.Entity.ContinenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinenteRepositorio extends JpaRepository<ContinenteEntity,Long>{
    
}
