package week2day2;

import org.testng.annotations.Test;

public class MasterAttributes {
	
	@Test(enabled=false)
	public void merge(){
		
		System.out.println("Merge Lead");

}
	@Test(alwaysRun=true,dependsOnMethods={"createlead"})
	public void delete(){
		
		System.out.println("Delete Lead");

	
}
	
	@Test()
	public void createlead(){
		
		System.out.println("createlead");

}
	
	
}