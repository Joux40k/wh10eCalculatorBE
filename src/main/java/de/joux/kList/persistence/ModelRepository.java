package de.joux.kList.persistence;

import de.joux.kList.persistence.entity.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends CrudRepository<Model, Long> {
}
