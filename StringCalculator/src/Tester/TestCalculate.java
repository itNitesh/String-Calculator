package Tester;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.platform.commons.annotation.Testable;

@Testable
public class TestCalculate {

	public void emptyStringReturnZero() {
		Calculator calculatror=new Calculator();
		assertEquals(0,Calculator.calculate(""));
	}
}
