package de.dailab.cucumber;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProjectTest{
    
    /** ProjectTest constructor */
    public ProjectTest(){}
    
    @Test
    public void testProjectShouldHaveTitle() {
        Project project = new Project();
        project.setTitle("foo");
        assertEquals("foo", project.getTitle());
    }

    @Test
    public void testProjectsAllShouldNeverBeNull() {
        class MyProject extends Project{}
        assertNotNull(MyProject.all());
    }

    @Test
    public void testProjectAll() {
        Project project = new Project();
        project.setTitle("Title");
        Project.add(project);
        assertTrue(Project.all().contains(project));
    }
}