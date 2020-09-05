package ch.sbb.studyweek.repo;

import ch.sbb.studyweek.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}