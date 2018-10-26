package es.jose.biblioserver.services;

import es.jose.biblioserver.entities.Document;
import es.jose.biblioserver.repositories.DocumentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose B. Castillon Molina
 */
@Service
public class DocumentService {
    
    @Autowired
    private DocumentRepository documentRepository;

    public List<Document> findAll() {
        return (List<Document>) documentRepository.findAll();
    }
    
}
