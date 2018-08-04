package pl.metman.modules.authorization.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface TestRepo extends JpaRepository<TestEntity, Long>{

}
