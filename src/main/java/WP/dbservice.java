package WP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class dbservice {
    @Autowired
    dataInter dI;

    public void save(datamodel dm) {
        dI.save(dm);
    }

    public List<datamodel> listAll() {
        return (List<datamodel>) dI.findAll();
    }

    public datamodel get(Long id) {
        return dI.findById(id).get();
    }

    public void delete(Long id) {
        dI.deleteById(id);
    }

    public String searchPWbyLogin(String login) { return dI.searchPWbyLogin(login); }

    public Long getIdByLogin(String login) {return dI.getIdByLogin(login);}
}
