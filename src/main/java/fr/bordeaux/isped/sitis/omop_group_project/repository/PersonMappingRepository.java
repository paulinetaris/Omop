package fr.bordeaux.isped.sitis.omop_group_project.repository;

import fr.bordeaux.isped.sitis.omop_group_project.domain.PersonMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonMappingRepository extends JpaRepository<PersonMapping, Integer> {
    //je cherche a faire un get patient
    PersonMapping findByPersonIde(String personIde);
    boolean existsByPersonIde(String personIde);
}
