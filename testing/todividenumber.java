package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class todividenumber {

	@Test
	void positivetest() {
	JunitTesting positivetest= new JunitTesting();
	double output = positivetest.divide(40, 10);
	assertEquals(4,output);
	}
	
	@Test
	void negativetest( ) {
		JunitTesting negativetest= new JunitTesting();
		double output = negativetest.divide(10, 5);
		assertEquals(2,output);
		
	}

}
