package de.joux.kList.persistence;

import de.joux.kList.persistence.entity.WHModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<WHModel, Long> {
}
