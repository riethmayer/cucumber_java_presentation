package de.dailab.cucumber;

import cuke4duke.annotation.Pending;
import cuke4duke.annotation.I18n.EN.*;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

public class ProjectSteps{
    public List<Project> projects;
    public StringBuffer output;
    public Project currentProject;

    /** ProjectSteps constructor */
    public ProjectSteps(){
        output = new StringBuffer();
    }

    @Given ("^A project with title \"([^\"]*)\"$")
    public void aProjectWithTitle(String title) {
        Project project = new Project();
        project.setTitle(title);
        Project.add(project);
        currentProject = project;
    }

    @When ("^I list all Projects$")
    public void iListAllProjects() {
        projects = Project.all();
        for(Project project : Project.all()) {
            output.append(project.getTitle());
            //output.append(project.getDescription());
        }
    }

    @Then ("^I should see \"([^\"]*)\"$")
    public void iShouldSeeThisProject(String projectTitle) {
        if(! output.toString().matches(projectTitle))
            throw new RuntimeException("Project not found:" + projectTitle);
    }
}
