package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

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



    }





