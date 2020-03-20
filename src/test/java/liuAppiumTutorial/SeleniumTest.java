package liuAppiumTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void browserAutomation()
	{
		System.out.println("browserAutomation");
		Assert.assertEquals(1, 2);
	}
	
	@Test
	public void elementsUi()
	{
		System.out.println("elementsUi");
	}
}
