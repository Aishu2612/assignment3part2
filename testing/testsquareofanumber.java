package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testsquareofanumber extends JunitTesting {

	@Test
	void testsqofnum() {
     JunitTesting testsqofnum = new JunitTesting();
     int output= testsqofnum.square(5);
     assertEquals(25,output);
	}

}
