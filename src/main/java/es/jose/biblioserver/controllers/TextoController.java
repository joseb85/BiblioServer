package es.jose.biblioserver.controllers;

import es.jose.biblioserver.entities.Texto;
import es.jose.biblioserver.services.TextoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/texto")
public class TextoController {

    @Autowired
    private TextoService textoService;

    /**
     * Obtiene todos los autores
     *
     * @return Lista de autores
     */
    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAutores() {

        List<Texto> lista = textoService.findAll();
        return new ResponseEntity(lista, HttpStatus.OK);

    }
    
}
