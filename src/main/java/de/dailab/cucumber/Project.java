package de.dailab.cucumber;

import java.util.List;
import java.util.LinkedList;

public class Project{

    /** Project constructor */
    public Project(){}
    private String title;

    private static List<Project> projects;

    public static List<Project> all(){
        ensureProjectsExist();
        return projects;
    }

    public static void add(Project p){
        ensureProjectsExist();
        projects.add(p);
    }

    private static void ensureProjectsExist(){
        if(projects == null)
            projects = new LinkedList<Project>();
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Project){
            return ((Project) o).getTitle().equals(this.getTitle());
        } else {
            return false;
        }
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}

