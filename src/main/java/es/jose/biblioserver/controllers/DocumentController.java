package es.jose.biblioserver.controllers;

import es.jose.biblioserver.entities.Document;
import es.jose.biblioserver.services.DocumentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    /**
     * Obtiene todos los autores
     *
     * @return Lista de autores
     */
    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAutores() {

        List<Document> lista = documentService.findAll();
        return new ResponseEntity(lista, HttpStatus.OK);

    }
    
}
