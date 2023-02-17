package app_java_8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A {

	@Test
	public void test1() {
		System.out.println(100);
	}
	
	@Before
	public void test2() {
		System.out.println("Before");
	}
	@After
	public void test3() {
		System.out.println("After");
	}
	@Test
	public void test8() {
		System.out.println(10);
	}

	@BeforeClass
	public static void test4() {
		System.out.println("BeforeClass");
	}
	@AfterClass
	public static void test5() {
		System.out.println("AfterClass");
	}
}
