package es.jose.biblioserver.services;

import es.jose.biblioserver.entities.Formulari;
import es.jose.biblioserver.repositories.FormulariRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author joseb85
 */
@Service
public class FormulariService {
    
    @Autowired
    private FormulariRepository formulariRepository;

    public List<Formulari> findAll() {
        return (List<Formulari>) formulariRepository.findAll();
    }

    public Formulari findById(Long id) {
        Optional<Formulari> cf = formulariRepository.findById(id);
        return cf.isPresent() ? cf.get() : null;
    }

    @Transactional
    public Formulari save(Formulari item) {
        item = formulariRepository.save(item);
        return findById(item.getId());
    }
    
}
