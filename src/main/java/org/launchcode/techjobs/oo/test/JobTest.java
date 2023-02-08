package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */

@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job a = new Job();
        Job b = new Job("abc", new Employer(), new Location(), new PositionType(), new CoreCompetency());
        assertNotEquals(a, b);
        };

    @Test
    public void testJobConstructorSetsAllFields() {
        Job a = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(a.getName(), "Product tester");
        assertTrue(a instanceof Job);
        assertEquals(a.getEmployer().getValue(), "ACME");
        assertTrue(a.getEmployer() instanceof Employer);
        assertEquals(a.getLocation().getValue(), "Desert");
        assertTrue(a.getLocation() instanceof Location);
        assertEquals(a.getPositionType().getValue(), "Quality control");
        assertTrue(a.getPositionType() instanceof PositionType);
        assertEquals(a.getCoreCompetency().getValue(), "Persistence");
        assertTrue(a.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality(){
        Job a = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job b = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(a.getId() == b.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job a = new Job();
        Character first = a.toString().charAt(0);
        int lastIndex = a.toString().length() -1;
        Character last = a.toString().charAt(lastIndex);
        Character newLine = '\n';
        assertEquals(first, newLine);
        assertEquals(last, newLine);
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job a = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String[] beeoup = a.toString().split("\n");
        assertEquals(beeoup[1], "ID: 1");
        assertEquals(beeoup[2], "Name: Product tester");
        assertEquals(beeoup[3], "Employer: ACME");
        assertEquals(beeoup[4], "Location: Desert");
        assertEquals(beeoup[5], "Position Type: Quality control");
        assertEquals(beeoup[6], "Core Competency: Persistence");
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job a = new Job(null, new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String[] beeoup = a.toString().split("\n");
        assertEquals(beeoup[2], "Name: Data not available");
    }

    @Test
    public void testIfOnlyIdReturnsOOPSString() {
        Job a = new Job();
        assertTrue(a.toString() == "OOPS! This job does not seem to exist.");
    }


    }





