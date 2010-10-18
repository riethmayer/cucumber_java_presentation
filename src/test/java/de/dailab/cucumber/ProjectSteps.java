package de.dailab.cucumber;
import cuke4duke.annotation.Pending;
import cuke4duke.annotation.I18n.EN.*;
import java.util.List;
import java.util.LinkedList;

public class ProjectSteps{

    private List<Project> projects;

    /** ProjectSteps constructor */
    public ProjectSteps(){}

    @Given ("^a Project called \"([^\"]*)\"$")
    public void aProjectCalled(String title) {
        this.projects = new LinkedList<Project>();
        
        Project project = new Project();
        project.setTitle(title);

        this.projects.add(project);
    }
}
