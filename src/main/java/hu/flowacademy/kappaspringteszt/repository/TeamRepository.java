package hu.flowacademy.kappaspringteszt.repository;

import hu.flowacademy.kappaspringteszt.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {
}
