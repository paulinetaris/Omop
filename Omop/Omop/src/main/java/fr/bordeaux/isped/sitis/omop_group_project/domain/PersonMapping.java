package fr.bordeaux.isped.sitis.omop_group_project.domain;
import fr.bordeaux.isped.sitis.omop_group_project.service.SndsDTO;
import jakarta.persistence.*;

@Entity
@Table(name="person_mapping", schema="omop")
public class PersonMapping {

    @Id
    @Column(name="person_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator")
    @SequenceGenerator(name="sequence-generator", sequenceName = "omop.seq_pat" , schema="omop" , initialValue = 1, allocationSize = 1)
    private Integer personId;

    @Column(name = "person_ide")
    private String personIde;

    // join by pat_id
    @OneToOne
    @JoinColumn(name = "person_ide", referencedColumnName = "pat_id", insertable = false, updatable = false)
    private SndsDomain sndsDomain;

    // Empty constructor require JPA
    /*
    public PersonMapping(PersonMapping personMapping) {
    }
    */
    public PersonMapping(){
    }

    public PersonMapping(Integer personId, String personIde, SndsDomain sndsDomain) {
        this.personId = personId;
        this.personIde = personIde;
        this.sndsDomain = sndsDomain;
    }

    //DTO link to get sndsSDomain
    public PersonMapping (SndsDTO sndsDTO){
        this.personIde = sndsDTO.getSndsId();
    }

    /*for later :
     *     public PersonMapping(SndsDTO sndsDTO) {
     * SndsPatientDTO (qui contient le person_id issu de la table de mapping obtenu par jointrure entre OmopPersonMapping et SndsPatient)
     * } */

    // Getters et Setters

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonIde() {
        return personIde;
    }

    public void setPersonIde(String personIde) {
        this.personIde = personIde;
    }

    public SndsDomain getSndsDomain() {
        return sndsDomain;
    }

    public void setSndsDomain(SndsDomain sndsDomain) {
        this.sndsDomain = sndsDomain;
    }
}
