package com.alkemy.icons.icons.Entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;   

@Entity
@Table(name="pais")
@Getter
@Setter
public class PaisEntity {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    
    private String imagen;
    
    private String denominacion;
    
    @Column(name="cant_habitantes")
    private Long cantidadHabitantes;
    
    private Long superficie; //a2
    
    @ManyToOne(fetch =FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "continente_id", insertable=false, updatable = false)
    private ContinenteEntity continente;
    
    @Column(name="continente_id", nullable = false)
    private Long continenteId;
    
    @ManyToMany(
            cascade ={
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(
                name="icon_pais",
                joinColumns = @JoinColumn(name="pais_id"),
                inverseJoinColumns = @JoinColumn(name="icon_id"))
    private Set<IconEntity>icons=new HashSet<>();
    
    @Override
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PaisEntity other = (PaisEntity) obj;
        return other.id == this.id;
    }
}
