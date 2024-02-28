package Test123;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;  

public class TestBefore {
	/*
		@org.testng.annotations.AfterSuite
		public void AfterSuite() {
		System.out.println("Inside After Suite");
		}

		@Test(groups = {"smoke"})
		public void TestRun() {
		System.out.println("In test runner no 1");
		}
		@Test(groups = {"regression"})
		public void TestRun1() {
		System.out.println("In test runner no 2");
		}
		@BeforeGroups(groups={"regression"})
		public void beforeGroup() {
		System.out.println("This is inside before group");
		}
		@AfterGroups(groups={"regression"})
		public void afterGroup() {
		System.out.println("This is inside after group");
		}
		@BeforeSuite
		public void Beforesuite() {
		System.out.println("Inside Before suite");
		}
		@BeforeTest
		public void beforetest() {
		System.out.println("Inside before test");
		}
		@AfterTest
		public void Aftertest() {
		System.out.println("Inside after test");
		}
		@BeforeClass
		public void beforeClass() {
		System.out.println("Before class");
		}

		@AfterClass
		public void afterClass() {
		System.out.println("After class");
		}*/
	
		@Test
		@Parameters({"a","b"})
		public void add(int a,int b) {
			int add;
			add= a+b;
			System.out.println(add);
		}

}
