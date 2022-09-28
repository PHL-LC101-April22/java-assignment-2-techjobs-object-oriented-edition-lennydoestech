package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

     @Override
    public String toString(){
        String returnStatement = '\n' + "ID: " + id;

        if(this.name.equals("")){
            returnStatement += '\n' + "Name: " + "Data not available";
        } else {
            returnStatement += '\n' + "Name: " + name;
        }
        if(this.employer.getValue().equals("")){
            returnStatement += '\n' + "Employer: " + "Data not available";
        }else{
            returnStatement += '\n' + "Employer: " + employer;
        }
        if(this.location.getValue().equals("")){
            returnStatement += '\n' + "Location: " + "Data not available";
        }else {
            returnStatement += '\n' + "Location: " + location;
        }
        if(this.positionType.getValue().equals("")){
            returnStatement += '\n' + "Position Type: " + "Data not available";
        }else {
            returnStatement += '\n' + "Position Type: " + positionType;
        }
        if(this.coreCompetency.getValue().equals("")){
            returnStatement += '\n' + "Core Competency: " + "Data not available";
        }else {
            returnStatement += '\n' + "Core Competency: "+ coreCompetency;
        }
        return returnStatement += '\n';
         }

}


