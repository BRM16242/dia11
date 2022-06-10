package repositories;

import java.util.ArrayList;

import models.CategoriaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<CategoriaModel,Long> {

}