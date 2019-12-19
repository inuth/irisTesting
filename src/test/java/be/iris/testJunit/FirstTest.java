package be.iris.testJunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import be.iris.testJunit.services.MathService;

public class FirstTest{
	
	
	private MathService mathService;
	
	@BeforeClass
	public static void aaa() {
		//
	}
	
	@Before
	public void init() {
		mathService = new MathService();
	}
	
	@Test
	public void mathServiceSomme_twoPositivInts_10() {
		// AAA
		// ARRANGE
		int a = 3;
		int b = 7;
		
		int total = 10;
		
		// ACT
		int result = mathService.somme(a, b);
		
		// ASSERT
		Assert.assertEquals(total, result);	
	}
	
	@Test
	public void test2() {
		// AAA
		// ARRANGE
		int a = 3;
		int b = 7;
		
		int total = 10;
		
		
		// ACT
		int result = mathService.somme(a, b);
		
		// ASSERT
		Assert.assertEquals(total, result);	
	}
	
	@Test
	public void test3() {
		// AAA
		// ARRANGE
		int a = 3;
		int b = 7;
		
		int total = 10;
		
		
		// ACT
		int result = mathService.somme(a, b);
		
		// ASSERT
		Assert.assertEquals(total, result);	
	}
	
	@Test
	public void test4() {
		// AAA
		// ARRANGE
		int a = 3;
		int b = 7;
		
		int total = 10;
		
		
		// ACT
		int result = mathService.somme(a, b);
		
		// ASSERT
		Assert.assertEquals(total, result);	
	}
	
//	@Test(expected = Exception.class)
//	public void test5() {
//		// AAA
//		// ARRANGE
//		int a = 3;
//		int b = 7;
//		
//		int total = 10;
//		
//		
//		// ACT
//		int result = mathService.somme(a, b);
//		
//	}
}
