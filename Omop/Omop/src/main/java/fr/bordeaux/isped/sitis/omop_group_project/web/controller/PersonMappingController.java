package fr.bordeaux.isped.sitis.omop_group_project.web.controller;

import fr.bordeaux.isped.sitis.omop_group_project.domain.PersonMapping;
import fr.bordeaux.isped.sitis.omop_group_project.service.PersonMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    public class PersonMappingController {
        @Autowired
        private PersonMappingService personMappingService;

        @PostMapping("/id_patient")
        public ResponseEntity<String> insertPersonMapping() {
            personMappingService.idMapping();
            return ResponseEntity.ok("person_mapping table populated successfully");
        }
    }
/*
// 2é endpoint pour récupérer tous les PersonMappings
@GetMapping
public ResponseEntity<List<PersonMapping>> getAllPersonMappings() {
    List<PersonMapping> personMappings = personMappingService.getAllPersonMappings();
    return new ResponseEntity<>(personMappings, HttpStatus.OK);
}
*/







//    private final PersonMappingService personMappingService;

    /*@Autowired
    public PersonMappingController(PersonMappingService personMappingService) {
        this.personMappingService = personMappingService;
    }

    // 1er end Endpoint pour déclencher la génération des PersonMappings depuis les pat_id
    @PostMapping("/generate")
    public ResponseEntity<Void> generatePersonMappingsFromSndsDomain() {
        personMappingService.generatePersonMappingsFromSndsDomain();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // 2é endpoint pour récupérer tous les PersonMappings
    @GetMapping
    public ResponseEntity<List<PersonMapping>> getAllPersonMappings() {
        List<PersonMapping> personMappings = personMappingService.getAllPersonMappings();
        return new ResponseEntity<>(personMappings, HttpStatus.OK);
    }
}*/
