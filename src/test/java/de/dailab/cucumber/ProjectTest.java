package de.dailab.cucumber;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProjectTest{

    /** ProjectTest constructor */
    public ProjectTest(){}

    @Test
    public void testProjectShouldHaveATitle() {
        Project p = new Project();
        p.setDescription("with description");
        assertEquals(false, p.valid());
        assertEquals("Title blank", p.errors());
    }
    
    @Test
    public void testProjectShouldHaveADescription() {
        Project p = new Project();
        p.setTitle("with Title");
        assertEquals(false, p.valid());
        assertEquals("Description blank", p.errors());
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
        project.setDescription("Description");
        Project.add(project);
        assertTrue(Project.all().contains(project));
    }
}

