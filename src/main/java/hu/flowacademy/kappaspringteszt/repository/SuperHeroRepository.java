package hu.flowacademy.kappaspringteszt.repository;

import hu.flowacademy.kappaspringteszt.entities.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperHeroRepository extends JpaRepository<SuperHero, String> {
}
