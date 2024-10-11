package application.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import application.model.Plataforma;
import application.repository.PlataformaRepository;
 
@RestController
@RequestMapping("/plataformas")
public class PlataformaController {
    @Autowired
    private PlataformaRepository plataformaRepo;
 
    @PostMapping
    public Plataforma insert(@RequestBody Plataforma plataforma) {
        return plataformaRepo.save(plataforma);
    }
}
 