package programming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void leavesNormalNumbersAlone() {
		
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
		
		assertEquals("1", fizzBuzz.convert(1));
		assertEquals("2", fizzBuzz.convert(2));

	}
	
	@Test
	void fizzBuzzConvertsMultiplesOfThree() {
		
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
		
		assertEquals("Fizz", fizzBuzz.convert(3));

	}
	
	@Test
	void fizzBuzzConvertsMultiplesOfFive() {
		
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
		
		assertEquals("Buzz", fizzBuzz.convert(5));

	}
	
	@Test
	void fizzBuzzConvertsMultiplesOfFiveAndThree() {
		
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
		
		assertEquals("FizzBuzz", fizzBuzz.convert(15));

	}

}
