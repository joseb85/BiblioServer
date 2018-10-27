package es.jose.biblioserver.repositories;

import es.jose.biblioserver.entities.Texto;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author joseb85
 */
public interface TextoRepository extends PagingAndSortingRepository<Texto, Long>{

}
