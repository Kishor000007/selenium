package testNG_programs;

import org.testng.annotations.Test;

public class T21 {

	@Test(groups = {"functional"})
	public void Script1(){
		System.out.println("From script-1");
	}
	@Test(groups = {"functional","smoke"})
	public void Script2(){
		System.out.println("From script-2");
	}
	@Test(groups = {"smoke"})
	public void Script3(){
		System.out.println("From script-3");
	}
	@Test(groups = {"system"})
	public void Script4(){
		System.out.println("From script-4");
	}
	@Test(groups = {"system"})
	public void Script5(){
		System.out.println("From script-5");
	}
}
