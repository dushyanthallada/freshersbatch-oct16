package Repository;
import org.springframework.data.mongodb.repository.MongoRepository;


import model.ProductInfo;


public interface ProductRepository extends MongoRepository<ProductInfo,Integer> {

}