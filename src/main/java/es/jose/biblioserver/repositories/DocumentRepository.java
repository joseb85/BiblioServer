package es.jose.biblioserver.repositories;

import es.jose.biblioserver.entities.Document;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Jose B. Castillon Molina
 */
public interface DocumentRepository extends PagingAndSortingRepository<Document, String>{

}
