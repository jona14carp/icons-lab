
package com.alkemy.icons.icons.Entity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;        



@Entity
@Table (name="continente")
@Getter
@Setter
public class ContinenteEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    
    private String imagen;
    
    private String denominacion;
}
