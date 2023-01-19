

public class sampleScript 
{
	public static void main(String[] args) 
	{
		String Browser = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
	
		System.out.println(Browser);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}
}
