package school.devskill.fumetteria.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import school.devskill.fumetteria.model.Product;

import java.util.List;

public interface IProductRepository extends CrudRepository<Product,Integer> {

List<Product> findById(int id);
List<Product> findByDimensionIsNotNull();
List<Product> findByAuthor(int Author);
@Query(value = "SELECT * FROM Product p WHERE p.author =autore", nativeQuery = true)
List<Product> listaProdottiPerAutore(@Param("autore")Integer idAutore);
}
