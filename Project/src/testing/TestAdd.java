package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAdd {
	
   @Test
	public void testAdd() {
		System.out.println("add");
		String s1 = "2";
		String s2 = "2";
		MyTest instance = new MyTest();
		int expectedResult = 4;
		int result = instance.add(s1, s2);
		assertEquals(expectedResult, result);

	}
	@Test
	public void testAdd2() {
		System.out.println("add");
		String s1 = "3";
		String s2 = "2";
		MyTest instance = new MyTest();
		int expectedResult = 5;
		int result = instance.add(s1, s2);
		assertEquals(expectedResult, result);

	}

}
