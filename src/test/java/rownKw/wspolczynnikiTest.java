package rownKw;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class wspolczynnikiTest {

	
	wspolczynniki t = new wspolczynniki("4","5","6");
	
	
	@Test
	public void testWspolczynniki() {
		
		
		
		try {
			assertEquals(4, t.a);
			assertEquals(5, t.b);
			assertEquals(6, t.c);
			
		} 
	catch (AssertionError e) {
		fail("Wynik zamiany string na int nie jest poprawny.");                                     
		}
		
	}

}
