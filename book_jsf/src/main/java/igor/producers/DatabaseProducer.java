package igor.producers;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DatabaseProducer {
	@Produces
	@PersistenceContext(unitName="book_jsf")
	private EntityManager em;
}
