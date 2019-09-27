package programming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcctualFizzBuzzAppTest {

	@Test
	void outputOfTheFirstHundred() {
		
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
		for(int i=1; i<=100; i++) {
			System.out.println(fizzBuzz.convert(i));
		}
		
	}

}
