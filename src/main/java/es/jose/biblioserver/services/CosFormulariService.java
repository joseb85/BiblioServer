package es.jose.biblioserver.services;

import es.jose.biblioserver.entities.CosFormulari;
import es.jose.biblioserver.repositories.CosFormulariRepository;
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
public class CosFormulariService {
    
    @Autowired
    private CosFormulariRepository cosFormulariRepository;

    public List<CosFormulari> findAll() {
        return (List<CosFormulari>) cosFormulariRepository.findAll();
    }

    public CosFormulari findById(Long id) {
        Optional<CosFormulari> cf = cosFormulariRepository.findById(id);
        return cf.isPresent() ? cf.get() : null;
    }

    @Transactional
    public CosFormulari save(CosFormulari item) {
        item = cosFormulariRepository.save(item);
        return findById(item.getFormulari());
    }
    
}
