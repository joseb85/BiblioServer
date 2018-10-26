package es.jose.biblioserver.services;

import es.jose.biblioserver.entities.DadesFormulari;
import es.jose.biblioserver.repositories.DadesFormulariRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose B. Castillon Molina
 */
@Service
public class DadesFormulariService {
    
    @Autowired
    private DadesFormulariRepository dadesFormulariRepository;

    public List<DadesFormulari> findAll() {
        return (List<DadesFormulari>) dadesFormulariRepository.findAll();
    }
    
}
