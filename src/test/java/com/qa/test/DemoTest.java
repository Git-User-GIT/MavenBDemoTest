package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void sum() {
		System.out.println("---add----");
		int a=10;
		int b=12;
		Assert.assertEquals(22,a+b);
	}
	@Test
	public void minus() {
		System.out.println("---minus---");
		int a=10;
		int b=2;
		Assert.assertEquals(8,a-b);
	}

}
