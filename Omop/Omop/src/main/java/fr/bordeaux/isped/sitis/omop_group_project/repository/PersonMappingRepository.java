package fr.bordeaux.isped.sitis.omop_group_project.repository;

import fr.bordeaux.isped.sitis.omop_group_project.domain.PersonMapping;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonMappingRepository extends JpaRepository<PersonMapping, Integer> {
// we are modifying data with update so modifying and transactional because of update
        @Transactional
        @Modifying
        /* it is needed to insert the two columns at the same time and the other with the sequence created in the domain OmopPersonMapping
         * so we will not have issues with a column with null values while it is not allowed by the databases constraints*/
        @Query(value = "insert into omop.person_mapping (person_id, person_ide) " +
                "SELECT nextval('omop.seq_pat'), pat_id " +
                "FROM synthetic_snds.tab_patient", nativeQuery = true)
        // when there is a query it seems like we have to add a method
        void insertPersonMapping();


    }
/*
*    //je cherche a faire un get patient
    PersonMapping findByPersonIde(String personIde);
    boolean existsByPersonIde(String personIde);
}*/