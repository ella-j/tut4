package tut4CI;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class TestCalc {

	@Test

	public void testAdd() {
		assertEquals(5, new Calc().add(2, 3));
	}

	@Test
	
	public void testSubtract() {
		assertEquals(2, new Calc().subtract(5, 3));
	}

}
