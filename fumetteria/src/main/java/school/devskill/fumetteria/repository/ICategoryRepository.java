package school.devskill.fumetteria.repository;

import org.springframework.data.repository.CrudRepository;
import school.devskill.fumetteria.model.Category;

public interface ICategoryRepository extends CrudRepository<Category,String> {
}
