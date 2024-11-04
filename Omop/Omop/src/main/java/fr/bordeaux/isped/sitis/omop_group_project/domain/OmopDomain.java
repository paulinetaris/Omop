package fr.bordeaux.isped.sitis.omop_group_project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="person", schema="omop")
public class OmopDomain {
    //Attributes
    @Column(name="person_id")
    private Integer personId ;

    @Column(name="year_of_birth")
    private Integer yearBirth ;

    @Column(name="month_if_birth")
    private Integer monthBirth ;

    @Column(name="day_of_birth")
    private Integer dayBirth ;

    @Column(name="birth_datetime")
    private LocalDate dateBirth ;

    @Column(name="location_id")
    private Integer locationID ;
    //Constructor
    //Empty constructor
    public OmopDomain() {}
    //Constructors

    public OmopDomain(Integer personId, Integer yearBirth, Integer monthBirth, Integer dayBirth, LocalDate dateBirth, Integer locationID) {
        this.personId = personId;
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.dateBirth = dateBirth;
        this.locationID = locationID;
    }
    //Getters and Setters


    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(Integer yearBirth) {
        this.yearBirth = yearBirth;
    }

    public Integer getMonthBirth() {
        return monthBirth;
    }

    public void setMonthBirth(Integer monthBirth) {
        this.monthBirth = monthBirth;
    }

    public Integer getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(Integer dayBirth) {
        this.dayBirth = dayBirth;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Integer getLocationID() {
        return locationID;
    }

    public void setLocationID(Integer locationID) {
        this.locationID = locationID;
    }
    // To string
    @Override
    public String toString() {
        return "OmopDomain{" +
                "personId=" + personId +
                ", yearBirth=" + yearBirth +
                ", monthBirth=" + monthBirth +
                ", dayBirth=" + dayBirth +
                ", dateBirth=" + dateBirth +
                ", locationID=" + locationID +
                '}';
    }
}
