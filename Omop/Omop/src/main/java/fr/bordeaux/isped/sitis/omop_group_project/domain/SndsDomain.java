package fr.bordeaux.isped.sitis.omop_group_project.domain;

import jakarta.persistence.*;
        import java.time.LocalDate;

@Entity
@Table(name = "tab_patient", schema = "synthetic_snds")
public class SndsDomain {
    //Attributes
    @Id
    @Column(name="pat_id")
    private String patId;

    @Column(name="pat_birth_date")
    private LocalDate patBirthPlace;

    @Column(name = "pat_dpt_res")
    private Integer patDptRes;

    @Column(name = "pat_sex_cod")
    private Integer patSexCod;

    @Column(name = "pat_hea_insur")
    private String patHeaInsur;

    @Column(name = "pat_loc_iris")
    private String patLocIris;

    @Column(name = "pat_death_date")
    private LocalDate patDeathDate;

    // foreign key
    @OneToOne(mappedBy = "sndsDomain")
    private PersonMapping personMapping;



    //Empty constructor

    public SndsDomain() {
    }

    //Constructors

    public SndsDomain(String patId, LocalDate patBirthPlace, Integer patDptRes, Integer patSexCod, String patHeaInsur, String patLocIris, LocalDate patDeathDate, PersonMapping personMapping) {
        this.patId = patId;
        this.patBirthPlace = patBirthPlace;
        this.patDptRes = patDptRes;
        this.patSexCod = patSexCod;
        this.patHeaInsur = patHeaInsur;
        this.patLocIris = patLocIris;
        this.patDeathDate = patDeathDate;
        this.personMapping = personMapping;
    }


    // Getters et Setters

    public String getPatId() {
        return patId;
    }

    public void setPatId(String patId) {
        this.patId = patId;
    }


    public LocalDate getPatBirthPlace() {
        return patBirthPlace;
    }

    public void setPatBirthPlace(LocalDate patBirthPlace) {
        this.patBirthPlace = patBirthPlace;
    }

    public Integer getPatDptRes() {
        return patDptRes;
    }

    public void setPatDptRes(Integer patDptRes) {
        this.patDptRes = patDptRes;
    }

    public Integer getPatSexCod() {
        return patSexCod;
    }

    public void setPatSexCod(Integer patSexCod) {
        this.patSexCod = patSexCod;
    }

    public String getPatHeaInsur() {
        return patHeaInsur;
    }

    public void setPatHeaInsur(String patHeaInsur) {
        this.patHeaInsur = patHeaInsur;
    }

    public String getPatLocIris() {
        return patLocIris;
    }

    public void setPatLocIris(String patLocIris) {
        this.patLocIris = patLocIris;
    }

    public LocalDate getPatDeathDate() {
        return patDeathDate;
    }

    public void setPatDeathDate(LocalDate patDeathDate) {
        this.patDeathDate = patDeathDate;
    }
}
