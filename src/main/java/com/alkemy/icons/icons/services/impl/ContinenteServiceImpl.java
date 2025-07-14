
package com.alkemy.icons.icons.services.impl;

import com.alkemy.icons.icons.Entity.ContinenteEntity;
import com.alkemy.icons.icons.Mapper.ContinenteMapper;
import com.alkemy.icons.icons.dto.ContinenteDTO;
import com.alkemy.icons.icons.repositorio.ContinenteRepositorio;
import com.alkemy.icons.icons.services.ContinenteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinenteServiceImpl implements ContinenteService{
    
    @Autowired
    private ContinenteMapper continenteMapper;
    @Autowired
    private ContinenteRepositorio continenteRepositorio;
    
    public ContinenteDTO save(ContinenteDTO dto){
        ContinenteEntity entity = continenteMapper.continenteDTO2Entity(dto);
        ContinenteEntity entitySaved = continenteRepositorio.save(entity);
        ContinenteDTO result = continenteMapper.continenteEntity2DTO(entitySaved);
        return result;
    }
    
    
    public List<ContinenteDTO> getAllContinentes(){
        List<ContinenteEntity>entities = this.continenteRepositorio.findAll();
        List<ContinenteDTO>result = this.continenteMapper.continenteEntityList2DTOList(entities);
        return result;
    }
}
