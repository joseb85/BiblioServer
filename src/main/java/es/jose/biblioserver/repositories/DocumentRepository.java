package es.jose.biblioserver.repositories;

import es.jose.biblioserver.entities.Document;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author joseb85
 */
public interface DocumentRepository extends PagingAndSortingRepository<Document, String>{

}
