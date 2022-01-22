package sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sim.DB.assignment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface assignmentRepository extends CrudRepository<assignment,Integer>,Repository {
}
