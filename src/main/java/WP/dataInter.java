package WP;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface dataInter extends CrudRepository<datamodel, Long> {
    @Query(value = "SELECT password FROM datamodel WHERE login LIKE '%' || :keyword || '%'")
    public String searchPWbyLogin(@Param("keyword") String keyword);

    @Query(value = "SELECT id FROM datamodel WHERE login LIKE '%' || :keyword || '%'")
    public Long getIdByLogin(@Param("keyword") String keyword);
}
