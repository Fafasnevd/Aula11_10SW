package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Plataforma;

public interface PlataformaRepository extends JpaRepository<Plataforma, Long> {
    public Plataforma findByNome(String nome);
}
