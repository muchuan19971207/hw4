import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest {
    @Test
    public void TestEquivalencePartitioning() {
        // grade = A
        char grade = App.LetterGrade(100);
        assertEquals('A', grade);
        grade = App.LetterGrade(90);
        assertEquals('A', grade);
        // grade = B
        grade = App.LetterGrade(80);
        assertEquals('B', grade);
        // grade = C
        grade = App.LetterGrade(70);
        assertEquals('C', grade);
        // grade = D
        grade = App.LetterGrade(60);
        assertEquals('D', grade);
        // grade = F
        grade = App.LetterGrade(50);
        assertEquals('F', grade);
        grade = App.LetterGrade(40);
        assertEquals('F', grade);
        grade = App.LetterGrade(30);
        assertEquals('F', grade);
        grade = App.LetterGrade(20);
        assertEquals('F', grade);
        grade = App.LetterGrade(10);
        assertEquals('F', grade);
        grade = App.LetterGrade(0);
        assertEquals('F', grade);
        // grade = X
        grade = App.LetterGrade(-1);
        assertEquals('X', grade);
        grade = App.LetterGrade(101);
        assertEquals('X', grade);
    }
    @Test
    public void TestBoundaryValueAnalysis() {
        // grade = A
        char grade = App.LetterGrade(100);
        assertEquals('A', grade);
        grade = App.LetterGrade(90);
        assertEquals('A', grade);
        // grade = B
        grade = App.LetterGrade(89);
        assertEquals('B', grade);
        grade = App.LetterGrade(80);
        assertEquals('B', grade);
        // grade = C
        grade = App.LetterGrade(79);
        assertEquals('C', grade);
        grade = App.LetterGrade(70);
        assertEquals('C', grade);
        // grade = D
        grade = App.LetterGrade(69);
        assertEquals('D', grade);
        grade = App.LetterGrade(60);
        assertEquals('D', grade);
        // grade = F
        grade = App.LetterGrade(59);
        assertEquals('F', grade);
        grade = App.LetterGrade(0);
        assertEquals('F', grade);
        // grade = X
        grade = App.LetterGrade(-1);
        assertEquals('X', grade);
        grade = App.LetterGrade(101);
        assertEquals('X', grade);
    }
}