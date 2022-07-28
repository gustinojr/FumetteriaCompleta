package school.devskill.fumetteria.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import school.devskill.fumetteria.model.User;

import java.util.List;

public interface IUserRepository extends CrudRepository <User,Integer> {

@Query(nativeQuery = true,value = "SELECT * FORM user u")
    List<User> listaUtenti();

List<User> findByName(String name);
@Query(value = "SELECT * FROM User u WHERE u.role=?1",nativeQuery = true)
List<User> utentiPerRuolo( String role);

@Query(value = "SELECT * FROM User u WHERE u.name=nome AND u.role=ruolo",nativeQuery = true)
    List<User> utentiPerNomeERuolo(@Param("ruolo") String role,@Param("nome") String name);

}
