package de.dailab.cucumber;

import static org.junit.Assert.*;
import org.junit.Test;

import cuke4duke.annotation.Pending;
import cuke4duke.annotation.I18n.EN.*;

public class ProjectSteps{

    StringBuffer output;

    /** ProjectSteps constructor */
    public ProjectSteps(){
        output = new StringBuffer();
    }

    @Given ("^A project with title \"([^\"]*)\"$")
    public void aProjectWithTitle(String title) {
        Project project = new Project();
        project.setTitle(title);
        Project.add(project);
    }

    @When ("^I list all Projects$")
    public void iListAllProjects() {
        for(Project project : Project.all()) {
            output.append(project.getTitle());
        } // output quasi als Ausgabe
    }

    @Then ("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String output) {
        if(!this.output.toString().matches(output))
            throw new RuntimeException("Expected to see" + output);
    }
}
