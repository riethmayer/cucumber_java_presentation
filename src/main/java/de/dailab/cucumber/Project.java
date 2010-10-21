package de.dailab.cucumber;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class Project{
    private static List<Project> projects;

    private Map<String,String> errors;
    private boolean valid;
    private String title;

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
        ensureProjects();
        projects.add(project);
    }

    public static List<Project> all(){
        ensureProjects();
        return projects;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
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

    private static void ensureProjects(){
        if(projects == null) projects = new LinkedList<Project>();
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Project){
            String t  = ((Project) o).getTitle();
            return (t.equals(this.getTitle()));
        } else {
            return false;
        }
    }
}


