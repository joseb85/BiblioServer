package es.jose.biblioserver.services;

import es.jose.biblioserver.entities.CosFormulari;
import es.jose.biblioserver.entities.DadesFormulari;
import es.jose.biblioserver.repositories.DadesFormulariRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joseb85
 */
@Service
public class DadesFormulariService {
    
    @Autowired
    private DadesFormulariRepository dadesFormulariRepository;

    public List<DadesFormulari> findAll() {
        return (List<DadesFormulari>) dadesFormulariRepository.findAll();
    }

    public DadesFormulari findById(Long id) {
        Optional<DadesFormulari> cf = dadesFormulariRepository.findById(id);
        return cf.isPresent() ? cf.get() : null;
    }
    
}
