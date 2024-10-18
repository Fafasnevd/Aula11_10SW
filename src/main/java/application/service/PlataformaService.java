package application.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import application.model.Plataforma;
import application.record.PlataformaDTO;
import application.repository.PlataformaRepository;
 
@Service
public class PlataformaService {
    @Autowired
    private PlataformaRepository plataformaRepo;
 
    public PlataformaDTO addPlataforma(PlataformaDTO plataforma) {
        return new PlataformaDTO(plataformaRepo.save(new Plataforma(plataforma)));
    }

    public Iterable<PlataformaDTO> getAll(){
        return plataformaRepo.findAll().stream().map(PlataformaDTO:: new).toList();
    }

    public PlataformaDTO getOne(long id) {
        Optional<Plataforma> resultado = plataformaRepo.findById(id);
        if(resultado.isEmpty()) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Plataforma Não encontrada"
            );
        }

        return new PlataformaDTO(resultado.get());
    }
}
 