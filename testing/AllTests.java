package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testsquareofanumber.class, tocountAs.class, todividenumber.class })
public class AllTests {

}
