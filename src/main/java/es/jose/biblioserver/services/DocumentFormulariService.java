package es.jose.biblioserver.services;

import es.jose.biblioserver.entities.DadesFormulari;
import es.jose.biblioserver.entities.DocumentFormulari;
import es.jose.biblioserver.repositories.DocumentFormulariRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joseb85
 */
@Service
public class DocumentFormulariService {
    
    @Autowired
    private DocumentFormulariRepository documentFormulariRepository;

    public List<DocumentFormulari> findAll() {
        return (List<DocumentFormulari>) documentFormulariRepository.findAll();
    }

    public DocumentFormulari findById(Long id) {
        Optional<DocumentFormulari> cf = documentFormulariRepository.findById(id);
        return cf.isPresent() ? cf.get() : null;
    }
    
}
