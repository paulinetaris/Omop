package fr.bordeaux.isped.sitis.omop_group_project.service;

import fr.bordeaux.isped.sitis.omop_group_project.domain.PersonMapping;
import fr.bordeaux.isped.sitis.omop_group_project.domain.SndsDomain;
import fr.bordeaux.isped.sitis.omop_group_project.repository.PersonMappingRepository;
import fr.bordeaux.isped.sitis.omop_group_project.repository.SndsDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonMappingService {

    private final PersonMappingRepository personMappingRepository;
    private final SndsDomainRepository sndsDomainRepository;

    @Autowired
    public PersonMappingService(PersonMappingRepository personMappingRepository, SndsDomainRepository sndsDomainRepository) {
        this.personMappingRepository = personMappingRepository;
        this.sndsDomainRepository = sndsDomainRepository;
    }

    // Méthode pour copier les pat_id de SndsDomain vers person_ide dans PersonMapping
    public void generatePersonMappingsFromSndsDomain() {
        List<SndsDomain> sndsDomains = sndsDomainRepository.findAll();
        for (SndsDomain sndsDomain : sndsDomains) {
            if (!personMappingRepository.existsByPersonIde(sndsDomain.getPatId())) {
                PersonMapping personMapping = new PersonMapping();
                personMapping.setPersonIde(sndsDomain.getPatId());
                personMappingRepository.save(personMapping);
            }
        }
    }

    // Méthode pour récupérer tous les Personmappings
    public List<PersonMapping> getAllPersonMappings() {
        return personMappingRepository.findAll();
    }
}
