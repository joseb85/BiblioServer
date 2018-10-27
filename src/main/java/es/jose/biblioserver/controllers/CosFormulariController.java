package es.jose.biblioserver.controllers;

import es.jose.biblioserver.entities.CosFormulari;
import es.jose.biblioserver.services.CosFormulariService;
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
@RequestMapping("/cosformulari")
public class CosFormulariController {

    @Autowired
    private CosFormulariService cosFormulariService;

    /**
     * Obtiene todos los autores
     *
     * @return Lista de autores
     */
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAutores() {
        List<CosFormulari> lista = cosFormulariService.findAll();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{num}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAutores(@PathVariable("num") Long id) {
        CosFormulari cos = cosFormulariService.findById(id);
        System.out.println(cos.getDadesFormulari());
        return new ResponseEntity(cos, HttpStatus.OK);
    }
    
    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity save(@RequestBody CosFormulari item) {
        CosFormulari cos = cosFormulariService.save(item);
        return new ResponseEntity(cos, HttpStatus.OK);
    }
    
}
