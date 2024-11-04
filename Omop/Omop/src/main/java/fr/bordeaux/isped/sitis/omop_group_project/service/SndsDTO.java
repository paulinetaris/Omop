package fr.bordeaux.isped.sitis.omop_group_project.service;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class SndsDTO {
    //Attributes
    private String sndsId;
    //Constructors
    public SndsDTO() {
    }

    public SndsDTO(String sndsId) {
        this.sndsId = sndsId;
    }
    //Getters and Setters

    public String getSndsId() {
        return sndsId;
    }

    public void setSndsId(String sndsId) {
        this.sndsId = sndsId;
    }

}
































/*
*     // contains person_id from person mapping but it's in sndsDomain
    // so it's how it's work with DTO's we have attributes and usually the id in the class from domain of the DTO
    private LocalDate patBirthPlace;
    private Integer patDptRes;
    private Integer patSexCod;
    private String patHeaInsur;
    private String patLocIris;
    private LocalDate patDeathDate;
    //Constructor
    public SndsDTO(){}
    //Getters and Setters

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
    }*/