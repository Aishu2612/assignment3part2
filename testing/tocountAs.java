package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tocountAs {

	@Test
	void countAs() {
		JunitTesting countAs= new JunitTesting();
		int output= countAs.count("AISHWARYA");
		assertEquals(3,output);
	}

}
