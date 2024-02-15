import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    @Test
    void qualifiedToTakeCourse() {
        Students student = new Students();
        assertEquals(true, student.takeCourse(true));
    }


    @Test
    void notQualifiedToTakeCourse() {
        Students student = new Students();
        assertEquals(false, student.takeCourse(false));
    }
}