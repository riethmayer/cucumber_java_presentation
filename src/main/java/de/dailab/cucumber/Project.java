package de.dailab.cucumber;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class Project{
    private String title;
    private Map<String,String> errors;
    private boolean valid;
    private static List<Project> projects;

    /** Project constructor */
    public Project(){
        this.errors = new HashMap<String,String>();
        this.valid = true;
    }

    public boolean valid(){
        this.valid = true;
        validateTitle();
        return this.valid;
    }

    public String errors(){
        String result = "";
        for(Entry<String,String> error : errors.entrySet()) {
            result += error.getKey() + " " + error.getValue();
        }
        return result;
    }

    public static void add(Project project){
        ensureProjectsExists();
        if(project.valid()){
            projects.add(project);
        }else{
            throw new RuntimeException("Attempt to add an invalid project");
        }            
    }

    public static List<Project> all(){
        ensureProjectsExists();
        return projects;
    }

    public static String list(){
        StringBuffer output = new StringBuffer();
        for(Project project : Project.all()) {
            output.append(project.getTitle());
        }
        return output.toString();
    }

    private static void ensureProjectsExists(){
        if(projects == null)
            projects = new LinkedList<Project>();
    }

    private boolean blank(String str){
        return (str == null || str == "");
    }

    private boolean validateTitle(){
        boolean blank = blank(getTitle());
        if(blank){
            this.errors.put("Title","blank");
            this.valid = false;
        }
        return blank;
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
