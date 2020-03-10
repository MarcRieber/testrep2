package mine.Repository;

import mine.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface MyRepository extends CrudRepository<Person, Long> {
}
