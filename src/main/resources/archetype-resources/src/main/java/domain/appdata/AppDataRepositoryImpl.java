package ${package}.domain.appdata;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class AppDataRepositoryImpl implements AppDataInterface {

    @PersistenceContext
    private EntityManager entityManager;

    public int complicatedQuery() {
        String query = "UPDATE app_data set data='HELLO WORLD'";

        return entityManager.createNativeQuery(query).executeUpdate();
    }
}
