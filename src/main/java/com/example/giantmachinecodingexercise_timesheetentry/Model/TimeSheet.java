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

    String Date;
    String Client;
    String Project; //This refers to the Project column in the CSV
    String Code;
    Double Hours;
    String Billable;
    String firstName;
    String lastName;
    Integer BillableRate;

    public TimeSheet() {
    }

    public TimeSheet(String date, String client, String project, String code, Double hours, String billable, String firstName, String lastName, Integer billableRate) {
        Date = date;
        Client = client;
        Project = project;
        Code = code;
        Hours = hours;
        Billable = billable;
        this.firstName = firstName;
        this.lastName = lastName;
        BillableRate = billableRate;
    }


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

    public Double getHours() {
        return Hours;
    }

    public void setHours(Double hours) {
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
}
