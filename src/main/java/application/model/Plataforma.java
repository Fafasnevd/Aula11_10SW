package application.model;

import application.record.PlataformaDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "plataformas")
@Getter
@Setter
public class Plataforma {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String nome;

    public Plataforma(PlataformaDTO dados) {
        this.id = dados.id();
        this.nome = dados.nome();
    }
    
}
