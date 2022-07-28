package school.devskill.fumetteria.repository;

import org.springframework.data.repository.CrudRepository;
import school.devskill.fumetteria.model.Type;

public interface ITypeRepository extends CrudRepository<Type,String> {
}
