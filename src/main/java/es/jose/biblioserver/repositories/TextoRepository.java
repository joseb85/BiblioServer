package es.jose.biblioserver.repositories;

import es.jose.biblioserver.entities.Texto;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Jose B. Castillon Molina
 */
public interface TextoRepository extends PagingAndSortingRepository<Texto, Long>{

}
