import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GradeBookTest 
{
	
	private static GradeBook gradebook1;
	private static GradeBook gradebook2;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception
	{
		gradebook1 = new GradeBook(5);
		gradebook2 = new GradeBook(5);
		
		gradebook1.addScore(100);
		gradebook1.addScore(60);
		
		gradebook2.addScore(50);
		gradebook2.addScore(78);
	}
	@AfterEach
	void tearDown () throws Exception
	{
		
	}
	@Test
	void testAddScore() 
	{
		assertTrue(gradebook1.toString().equals("100.0 60.0 0.0 0.0 0.0 "));
	    assertEquals(2, gradebook1.getScoreSize());
	    assertTrue(gradebook2.toString().equals("50.0 78.0 0.0 0.0 0.0 "));
		assertEquals(2, gradebook2.getScoreSize());
	}

	@Test
	void testSum() 
	{
		assertEquals(160, gradebook1.sum(), 0.0001);
		assertEquals(128, gradebook2.sum(), 0.0001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(60, gradebook1.minimum(), 0.0001);
		assertEquals(50, gradebook2.minimum(), 0.0001);
	}

	@Test
	void testFinalScore()
	{
		assertEquals(100, gradebook1.finalScore(), 0.0001);
		assertEquals(78, gradebook2.finalScore(), 0.0001);
	}
}
