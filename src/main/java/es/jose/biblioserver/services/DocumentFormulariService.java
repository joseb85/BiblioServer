package es.jose.biblioserver.services;

import es.jose.biblioserver.entities.DocumentFormulari;
import es.jose.biblioserver.repositories.DocumentFormulariRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose B. Castillon Molina
 */
@Service
public class DocumentFormulariService {
    
    @Autowired
    private DocumentFormulariRepository documentFormulariRepository;

    public List<DocumentFormulari> findAll() {
        return (List<DocumentFormulari>) documentFormulariRepository.findAll();
    }
    
}
