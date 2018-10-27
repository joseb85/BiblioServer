package es.jose.biblioserver.controllers;

import es.jose.biblioserver.entities.CosFormulari;
import es.jose.biblioserver.entities.DadesFormulari;
import es.jose.biblioserver.services.DadesFormulariService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/dadesformulari")
public class DadesFormulariController {

    @Autowired
    private DadesFormulariService dadesFormulariService;

    /**
     * Obtiene todos los autores
     *
     * @return Lista de autores
     */
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAll() {

        List<DadesFormulari> lista = dadesFormulariService.findAll();
        return new ResponseEntity(lista, HttpStatus.OK);

    }
    
    @RequestMapping(value = "/{num}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getById(@PathVariable("num") Long id) {
        DadesFormulari cos = dadesFormulariService.findById(id);
        return new ResponseEntity(cos, HttpStatus.OK);
    }
    
}
