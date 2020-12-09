package WP;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface dataInter extends CrudRepository<datamodel, Long> {
}
