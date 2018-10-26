package es.jose.biblioserver.services;

import es.jose.biblioserver.entities.CosFormulari;
import es.jose.biblioserver.repositories.CosFormulariRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose B. Castillon Molina
 */
@Service
public class CosFormulariService {
    
    @Autowired
    private CosFormulariRepository cosFormulariRepository;

    public List<CosFormulari> findAll() {
        return (List<CosFormulari>) cosFormulariRepository.findAll();
    }
    
}
