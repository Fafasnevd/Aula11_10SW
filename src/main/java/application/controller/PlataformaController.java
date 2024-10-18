package application.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import application.record.PlataformaDTO;
import application.service.PlataformaService;
 
@RestController
@RequestMapping("/plataformas")
public class PlataformaController {
    @Autowired
    private PlataformaService plataformaService;
 
    @PostMapping
    public PlataformaDTO insert(@RequestBody PlataformaDTO plataforma) {
        return  plataformaService.addPlataforma(plataforma);
    }

    @GetMapping
    public Iterable<Plataforma> list(){
        return plataformaService.getAll();
    }

    @GetMapping("/{id}")
    public PlataformaDTO get(@PathVariable long id) {
        return PlataformaService.getOne(id);
    }
}
 