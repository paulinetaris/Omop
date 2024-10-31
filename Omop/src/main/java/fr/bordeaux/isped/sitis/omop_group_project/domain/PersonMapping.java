package fr.bordeaux.isped.sitis.omop_group_project.domain;

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

    // ici le code pour lier les deux tables par pat_id
    @OneToOne
    @JoinColumn(name = "person_ide", referencedColumnName = "pat_id", insertable = false, updatable = false)
    private SndsDomain sndsDomain;

    // Constructeur vide requis par JPA
    public PersonMapping() {}

    public PersonMapping(PersonMapping personMapping) {
    }

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
