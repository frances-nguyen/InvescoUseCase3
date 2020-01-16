package com.invesco.usecase.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private long investmentIdentifier;
    @NotBlank
    private String region;
    @NotBlank
    private String office;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date registrationReceived;
    @NotBlank
    private String investmentName;
    @NotBlank
    private String dealStatus;
    @NotBlank
    private String city;
    @Embedded
    private State state;
    @NotBlank
    private String dealSource;
    @NotBlank
    private String acquisitionOfficer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getInvestmentIdentifier() {
        return investmentIdentifier;
    }

    public void setInvestmentIdentifier(long investmentIdentifier) {
        this.investmentIdentifier = investmentIdentifier;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Date getRegistrationReceived() {
        return registrationReceived;
    }

    public void setRegistrationReceived(Date registrationReceived) {
        this.registrationReceived = registrationReceived;
    }

    public String getInvestmentName() {
        return investmentName;
    }

    public void setInvestmentName(String investmentName) {
        this.investmentName = investmentName;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getDealSource() {
        return dealSource;
    }

    public void setDealSource(String dealSource) {
        this.dealSource = dealSource;
    }

    public String getAcquisitionOfficer() {
        return acquisitionOfficer;
    }

    public void setAcquisitionOfficer(String acquisitionOfficer) {
        this.acquisitionOfficer = acquisitionOfficer;
    }
}
