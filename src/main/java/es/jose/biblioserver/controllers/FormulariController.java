package es.jose.biblioserver.controllers;

import es.jose.biblioserver.entities.Formulari;
import es.jose.biblioserver.services.FormulariService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/formulari")
public class FormulariController {

    @Autowired
    private FormulariService formulariService;

    /**
     * Obtiene todos los autores
     *
     * @return Lista de autores
     */
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAutores() {
        List<Formulari> lista = formulariService.findAll();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{num}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAutores(@PathVariable("num") Long id) {
        Formulari cos = formulariService.findById(id);
        return new ResponseEntity(cos, HttpStatus.OK);
    }
    
    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity save(@RequestBody Formulari item) {
        Formulari cos = formulariService.save(item);
        return new ResponseEntity(cos, HttpStatus.OK);
    }
    
}
