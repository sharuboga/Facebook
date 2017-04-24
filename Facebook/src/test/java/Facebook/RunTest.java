package Facebook;

import org.testng.annotations.Test;

public class RunTest extends LaunchBrowser {
	
	@Test
	public void LoginFacebook() throws Exception
	{
	Credentials cr= new Credentials(driver);
	cr.Login("sharuboga", "password");
	
	}
}
