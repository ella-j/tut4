package tut4CI;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test

	public void testNumberGenerator() {
		assertEquals(42, new App().numberGenerator());
	}

}
