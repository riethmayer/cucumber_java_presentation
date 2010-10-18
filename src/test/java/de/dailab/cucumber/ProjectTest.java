package de.dailab.cucumber;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProjectTest{
    
    /** ProjectTest constructor */
    public ProjectTest(){}
    
    
    @Test
    public void testProjectShouldHaveTitle() {
        Project p = new Project();
        p.setTitle("foo");
        assertEquals("foo", p.getTitle());
    }
}
