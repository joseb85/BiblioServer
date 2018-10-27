package es.jose.biblioserver.controllers;

import es.jose.biblioserver.entities.DadesFormulari;
import es.jose.biblioserver.entities.DocumentFormulari;
import es.jose.biblioserver.services.DocumentFormulariService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/documentformulari")
public class DocumentFormulariController {

    @Autowired
    private DocumentFormulariService documentFormulariService;

    /**
     * Obtiene todos los autores
     *
     * @return Lista de autores
     */
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAutores() {
        List<DocumentFormulari> lista = documentFormulariService.findAll();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{num}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getById(@PathVariable("num") Long id) {
        DocumentFormulari cos = documentFormulariService.findById(id);
        return new ResponseEntity(cos, HttpStatus.OK);
    }
    
}
