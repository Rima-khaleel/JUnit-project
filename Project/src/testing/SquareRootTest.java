package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class SquareRootTest {

	@ParameterizedTest
	@ValueSource(doubles = { 0, 4, 1, -3, 2 })
	void testSquareRoot(double number) {
		assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {

			System.out.println("SquareRoot");
			double expectedResult = Math.sqrt(number);
			double result = Calculator.squareRoot(number);
			assertEquals(expectedResult, result);

		});
	}

}
