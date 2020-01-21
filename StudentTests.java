import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTests {
    private Student student;

    @Before
    public void setUp() {
        student = new Student("Marius", 18);
    }

    @Test
    public void calculateTest() {
        assertTrue(student.isMajor());
    }
}
