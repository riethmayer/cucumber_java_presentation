package de.dailab.cucumber;

public class ProjectSteps{

    /** ProjectSteps constructor */
    public ProjectSteps(){}

    @Given ("^A project with title \"([^\"]*)\"$")
    public void aProjectWithTitle(String title) {
        Project project = new Project();
        project.setTitle(title);
    }

}