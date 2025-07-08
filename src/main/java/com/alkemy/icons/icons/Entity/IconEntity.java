
package com.alkemy.icons.icons.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Getter
@Setter
@Table(name="icon")
public class IconEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Long id;
    
    private String imagen;
    
    private String denominacion;
    
    @Column (name="fecha_creacion")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaCreacion;
    
    private Long altura;
    
    private String historia;
    
    @ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
    private List<PaisEntity> paises = new ArrayList<>();
    
    //Add and remove paises
    public void addPais(PaisEntity pais) {this.paises.add(pais);}
    
    public void removePais(PaisEntity pais) {this.paises.remove(pais);}
}
