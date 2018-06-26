package org.launchcode.models.forms;

import org.launchcode.models.CoreCompetency;
import org.launchcode.models.Employer;
import org.launchcode.models.Location;
import org.launchcode.models.PositionType;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobForm {

    @NotNull
    @Size(min=1, message = "Name may not be empty")
    private String name;

    @NotNull
    private int employerId;

    @NotNull
    private int locationId;

    @NotNull
    private int skillId;

    @NotNull
    private int positionId;



    private ArrayList<Employer> employers;
    private ArrayList<Location> locations;
    private ArrayList<CoreCompetency> skills;
    private ArrayList<PositionType> positionTypes;

    public JobForm() {

        JobData jobData = JobData.getInstance();

        employers = jobData.getEmployers().findAll();
        locations = jobData.getLocations().findAll();
        skills = jobData.getCoreCompetencies().findAll();
        positionTypes = jobData.getPositionTypes().findAll();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }



    public int getLocationId(){return locationId;}

    public void setLocationId(int locationId){ this.locationId = locationId;}

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }



    public int getSkillId(){return skillId;}

    public void setSkillId(int skillId){this.skillId=skillId;}

    public ArrayList<CoreCompetency> getSkills() {
        return skills;
    }

    public void setCoreCompetencies(ArrayList<CoreCompetency> skills) {
        this.skills = skills;
    }


    public int getPositionId(){return positionId;}

    public void setPositionId(int positionId){this.positionId=positionId;}

    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }

    public void setPositionTypes(ArrayList<PositionType> positionTypes) {
        this.positionTypes = positionTypes;
    }
}
