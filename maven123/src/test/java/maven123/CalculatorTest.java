package maven123;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pkgcalculator.Calculator;
public class CalculatorTest {
	public static Calculator objCalculator;

	@Before

	public void setup() throws Exception {
		objCalculator=new Calculator();
	}

	@After

	public void tearDown() throws Exception {

	System.out.println("closing ");
	}

	@Test

	public void additionTest() {

	assertEquals(25, objCalculator.addition(12, 13));
	}

	@Test

	public void substractionTest() {
		assertEquals(-1,objCalculator.substraction(12, 13));
	}

  	@Test
    public void divisionTest() {
  		assertEquals(0,objCalculator.division(12, 13));
  	}

	@Test
	 
	public void MultiplyTest() {
		assertEquals(156,objCalculator.multiplication(12, 13));
	}
} 