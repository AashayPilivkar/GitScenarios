package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGFirstProgram {
	@Test
	private void firstTest(){
		System.out.println("First test pass with TestNG");
		
	}
	@Test
	private void secondTest() {
		System.out.println("Second test pass with TestNG");
	}

}
