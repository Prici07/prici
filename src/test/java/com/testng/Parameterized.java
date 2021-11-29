package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {
	@Test(priority = 0)
	@Parameters({"name","password"})
	public void printName(@Optional("suresh")String name,String pwrd) {
		System.out.println("the entered name is: " + name);
		System.out.println("the entered name is: " + pwrd);
	}

	@Test(priority = 2)
	@Parameters("password")
	public void printPwrd(String name) {
		System.out.println("the entered password is: " + name);
	}

	@Test(priority = 1)
	@Parameters("email")
	public void login(String name) {
		System.out.println("the entered email is: " + name);
	}

}
