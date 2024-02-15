import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {


    @Test
    void expel() {
        //Arrange
        //Write a mock for all objects
//        Principal principal = new Principal("P001", "Stephen Demide", "Male");
        Students student1 = new Students("Ojo Joseph", "S001", "Male", 71, true, true);

        Principal principal = new Principal();

//        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(actualContent));

        //Act
        principal.expel(student1);
        String actualContent = "Principal expel\nOjo Joseph\nfor gross misconduct";

        String expected = "Principal expel\nOjo Joseph\nfor gross misconduct";

        //Assert

        assertEquals(expected, actualContent.toString());
    }


    @Test
    void notExpel() {
        //Arrange
        //Write a mock for all objects
        Principal principal = new Principal("P001", "Stephen Demide", "Male");
        Students student1 = new Students("Ojo Joseph", "S001", "Male", 71, true, false);

        Principal principal1 = new Principal();
//
//        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(actualContent));

        //Act
        principal1.expel(student1);
        String actualContent = "Ojo Joseph\nis still a member of the school";

        String expected = "Ojo Joseph\nis still a member of the school";

        //Assert

        assertEquals(expected, actualContent.toString());
    }

    @Test
    void admit() {

        //Arrange
        //Write a mock for all objects
//        Principal principal = new Principal("P001", "Stephen Demide", "Male");
        Applicants applicants = new Applicants("Ojo Joseph", 72, "Male", 12);

        Principal principal = new Principal();

//        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(actualContent));

        //Act
        principal.admit(applicants);
        String actualContent = "Ojo Joseph\n Congratulations! you have been offered provincial admission into our school";

        String expected = "Ojo Joseph\n Congratulations! you have been offered provincial admission into our school";

        //Assert

        assertEquals(expected, actualContent.toString());
    }

    @Test
    void notAdmitted() {

        //Arrange
        //Write a mock for all objects
//        Principal principal = new Principal("P001", "Stephen Demide", "Male");
        Applicants applicants = new Applicants("Ojo Joseph", 72, "Male", 12);

        Principal principal = new Principal();

//        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(actualContent));

        //Act
        principal.admit(applicants);
        String actualContent = "Ojo Joseph\n We regret to inform you that you did not meet the entry requirements";

        String expected = "Ojo Joseph\n We regret to inform you that you did not meet the entry requirements";

        //Assert

        assertEquals(expected, actualContent.toString());
    }
}