package com.example.giantmachinecodingexercise_timesheetentry.Model;

/*The CSV contains the following fields (to be renamed):
 * Name(ProjectName, Client, Hours, Billable Hours, Billable Amount
 * */

import jakarta.persistence.*;

@Entity(name = "timesheet")
public class TimeSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public Float getHours() {
        return Hours;
    }

    public void setHours(Float hours) {
        Hours = hours;
    }

    public String getBillable() {
        return Billable;
    }

    public void setBillable(String billable) {
        Billable = billable;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBillableRate() {
        return BillableRate;
    }

    public void setBillableRate(Integer billableRate) {
        BillableRate = billableRate;
    }

    String Date;
    String Client;
    String Project; //This refers to the Project column in the CSV
    String Code;
    Float Hours;
    String Billable;
    String firstName;
    String lastName;
    Integer BillableRate;



/*/*CREATE TABLE TIMESHEET
(
    ID            INT PRIMARY KEY auto_increment NOT NULL,
    DATE          VARCHAR(255),
    CLIENT        VARCHAR(255),
    PROJECT       VARCHAR(255),
    CODE          VARCHAR(20),
    HOURS         FLOAT,
    BILLABLE      VARCHAR(255),
    FIRST_NAME    VARCHAR(255),
    LAST_NAME     VARCHAR(255),
    BILLABLE_RATE INT4
);*/


    public TimeSheet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
