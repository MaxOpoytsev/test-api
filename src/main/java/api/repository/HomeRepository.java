package api.repository;

import api.entity.HomePage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<HomePage,Long> {
}
