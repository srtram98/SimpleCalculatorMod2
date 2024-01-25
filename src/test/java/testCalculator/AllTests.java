package testCalculator;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
@RunWith(Suite.class)
@SuiteClasses({ testCalcAddition.class, testCalcDivision.class, testCalcMultiplication.class,
		testCalcSubtraction.class })
public class AllTests {

}
