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
    public void testSettingJobId(){
        Job aJob = new Job();
        Job anotherJob = new Job();
        assertNotEquals(aJob.getId(), anotherJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(Integer.class.isInstance(newJob.getId()));
        assertTrue(newJob.getName() instanceof String);
        assertTrue(newJob.getEmployer() instanceof Employer);
        assertTrue(newJob.getLocation() instanceof Location);
        assertTrue(newJob.getPositionType() instanceof PositionType);
        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", "Product tester");
        assertEquals("ACME", "ACME");
        assertEquals("Dessert", "Dessert");
        assertEquals("Quality control", "Quality control");
        assertEquals("Persistence", "Persistence");

    }
@Test
    public void testJobsForEquality(){
        Job aJob = new Job();
        Job anotherJob = new Job();
        assertFalse(aJob.equals(anotherJob));
}
@Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String [] aNewJob = aJob.toString().split("\n");
        System.out.println(aJob.toString().charAt(0) == '\n');
        assertEquals('\n', aJob.toString().charAt(0));
        assertEquals('\n', aJob.toString().charAt(aJob.toString().length()-1));
}
@Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("\nID: "+ aJob.getId() +
            "\nName: "+ aJob.getName() +
            "\nEmployer: "+ aJob.getEmployer().toString() +
            "\nLocation: "+ aJob.getLocation().toString() +
            "\nPosition Type: " + aJob.getPositionType().toString() +
            "\nCore Competency: " + aJob.getCoreCompetency().toString() + "\n", aJob.toString());

}

@Test
    public void testToStringHandlesEmptyField(){
        Job aJob = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String [] actual = aJob.toString().split("\n");
        assertEquals("Name: Data not available", actual[2]);
}
}
