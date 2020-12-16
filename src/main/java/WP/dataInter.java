package WP;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface dataInter extends CrudRepository<datamodel, Long> {
    @Query(value = "SELECT password FROM datamodel WHERE login LIKE '%' || :keyword || '%'")
    public String search(@Param("keyword") String keyword);
}
