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

    public Job(String name, Employer employer, Location location, PositionType position, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = position;
        this.coreCompetency = coreCompetency;
    }


    //If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
    @Override
    public String toString() {
        if (jobDoesntExist()) {
            return "\nOOPS! This job does not seem to exist.\n";
        }
        return '\n' +
                "ID: " + id + '\n' +
                "Name: " + getData(name)  + '\n' +
                "Employer: " + getData(employer) + '\n' +
                "Location: " + getData(location) + '\n' +
                "Position Type: " + getData(positionType) + '\n' +
                "Core Competency: " + getData(coreCompetency) + '\n';
    }
    private Object getData(JobField ex){
        return getData(ex == null ? null : ex.getValue());
    }

    private Object getData(String ex) {
        return ex == null || ex.isEmpty() ? "Data not available" : ex;
    }

    private Boolean jobDoesntExist() {
        return (name == null && employer == null && location == null && positionType == null && coreCompetency == null);
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
