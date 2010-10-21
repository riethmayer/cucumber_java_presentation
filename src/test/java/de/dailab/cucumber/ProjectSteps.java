package de.dailab.cucumber;

import cuke4duke.annotation.Pending;
import cuke4duke.annotation.I18n.EN.*;

public class ProjectSteps{

    /** ProjectSteps constructor */
    public ProjectSteps(){}

    @Given ("^A project with title \"([^\"]*)\"$")
    public void aProjectWithTitle(String title) {
        Project project = new Project();
        project.setTitle(title);
    }

}