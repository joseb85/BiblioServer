package es.jose.biblioserver.services;

import es.jose.biblioserver.entities.Texto;
import es.jose.biblioserver.repositories.TextoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose B. Castillon Molina
 */
@Service
public class TextoService {
    
    @Autowired
    private TextoRepository textoRepository;

    public List<Texto> findAll() {
        return (List<Texto>) textoRepository.findAll();
    }
    
}
