
package com.alkemy.icons.icons.services;

import com.alkemy.icons.icons.dto.ContinenteDTO;
import java.util.List;

public interface ContinenteService {
    
    ContinenteDTO save(ContinenteDTO dto);
    
    List<ContinenteDTO> getAllContinentes();
    
}
