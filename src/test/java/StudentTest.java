import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void StudentTest1() {
        Student student = new Student(StudentSituation.NORMAL, -0.5);
        assertThrows(RuntimeException.class, student::getLoanAmount);
    }

    @Test
    public void StudentTest2() {
        Student student = new Student(StudentSituation.NORMAL, 5.0);
        assertThrows(RuntimeException.class, student::getLoanAmount);
    }

    @Test
    public void StudentTest3() {
        Student student = new Student(StudentSituation.NEEDY, 2.3);
        assertEquals(0, student.getLoanAmount());
    }

    @Test
    public void StudentTest4() {
        Student student = new Student(StudentSituation.POOR,2.8);
        assertEquals(6_000_000, student.getLoanAmount());
    }

    @Test
    public void StudentTest5() {
        Student student = new Student(StudentSituation.NORMAL, 2.8);
        assertEquals(0, student.getLoanAmount());
    }

    @Test
    public void StudentTest6() {
        Student student = new Student(StudentSituation.POOR, 3.4);
        assertEquals(12_000_000, student.getLoanAmount());
    }

    @Test
    public void StudentTest7() {
        Student student = new Student(StudentSituation.NEEDY, 3.4);
        assertEquals(6_000_000, student.getLoanAmount());
    }

    @Test
    public void StudentTest8() {
        Student student = new Student(StudentSituation.NORMAL, 3.4);
        assertEquals(0, student.getLoanAmount());
    }

    @Test
    public void StudentTest9() {
        Student student = new Student(StudentSituation.POOR, 3.7);
        assertEquals(15_000_000, student.getLoanAmount());
    }

    @Test
    public void StudentTest10() {
        Student student = new Student(StudentSituation.NEEDY, 3.8);
        assertEquals(12_000_000, student.getLoanAmount());
    }

    @Test
    public void StudentTest11() {
        Student student = new Student(StudentSituation.NORMAL, 3.9);
        assertEquals(0, student.getLoanAmount());
    }
}