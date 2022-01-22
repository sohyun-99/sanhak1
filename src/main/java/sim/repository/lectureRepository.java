package sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sim.DB.lecture;

@Repository
public interface lectureRepository extends CrudRepository<lecture,Integer>,Repository{
}
