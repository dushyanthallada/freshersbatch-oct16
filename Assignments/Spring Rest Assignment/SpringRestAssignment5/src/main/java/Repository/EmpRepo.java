package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import Model.Emp;


public interface EmpRepo extends MongoRepository<Emp,Integer> {

	
}