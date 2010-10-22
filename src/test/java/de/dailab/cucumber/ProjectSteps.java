package de.dailab.cucumber;

import static org.junit.Assert.*;
import org.junit.Test;
import cuke4duke.annotation.Pending;
import cuke4duke.annotation.I18n.EN.*;

public class ProjectSteps{
    public StringBuffer output;
    public Project currentProject;

    private Project validProject(){
        Project project = new Project();
        project.setTitle("Project title");
        project.setDescription("Project description");
        return project;
    }

    /** ProjectSteps constructor */
    public ProjectSteps(){
        output = new StringBuffer();
    }

    @Given ("^A project with title \"([^\"]*)\"$")
    public void aProjectWithTitle(String title) {
        Project project = validProject();
        project.setTitle(title);
        Project.add(project);
        currentProject = project;
    }

    @Given ("^this project has the description \"([^\"]*)\"$")
    public void thisProjectHasTheDescription(String description) {
        currentProject.setDescription(description);
    }

    @When ("^I list all Projects$")
    public void iListAllProjects() {
        this.output.append(Project.list());
    }

    @Then ("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String output) {
        if(!this.output.toString().matches(output))
            throw new RuntimeException("Expected to see" + output);
    }
}
