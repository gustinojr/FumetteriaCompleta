package school.devskill.fumetteria.repository;

import org.springframework.data.repository.CrudRepository;
import school.devskill.fumetteria.model.Autor;

public interface IAuthorRepository extends CrudRepository <Autor,Integer> {
}
