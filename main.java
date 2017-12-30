import static org.junit.Assert.*;
import org.junit.*;

public class MyClass {
    public static char letterGrade(int score) {
		char grade;
		if (score <0 || score > 100)
			grade = 'X';
		else if (score>=90 && score <=100)
			grade = 'A';
		else if (score>=80 && score <90)
			grade = 'B';
		else if (score>=70 && score <80)
			grade = 'C';
		else if (score>=60 && score <70)
			grade = 'D';
		else
			grade ='F';
		return grade;
	}
    
    public static void main(String args[]) {
        assertEquals('A', letterGrade(95));
        assertEquals('B', letterGrade(85));
        assertEquals('C', letterGrade(75));
        assertEquals('D', letterGrade(65));
        assertEquals('F', letterGrade(30));
        assertEquals('X', letterGrade(105));
        assertEquals('X', letterGrade(-5));
        
        assertEquals('X', letterGrade(999));
        assertEquals('X', letterGrade(101));
        assertEquals('A', letterGrade(100));
        assertEquals('A', letterGrade(90));
        assertEquals('B', letterGrade(89));
        assertEquals('B', letterGrade(80));
        assertEquals('C', letterGrade(79));
        assertEquals('C', letterGrade(70));
        assertEquals('D', letterGrade(69));
        assertEquals('D', letterGrade(60));
        assertEquals('F', letterGrade(59));
        assertEquals('F', letterGrade(0));
        assertEquals('X', letterGrade(-1));
        assertEquals('X', letterGrade(-999));
        System.out.println("Test success!");
    }
}
