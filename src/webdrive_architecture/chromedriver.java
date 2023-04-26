package webdrive_architecture;

public class chromedriver implements webdriver
{


	public void get(String url) {
		System.out.println("Launch Url" +url);
		
	}

	public void findelement(String locator) {
		System.out.println("Find element Name" +locator);
		
	}


	public void close() {
		System.out.println("Close browser");
		
	}

	public void quit() {
		System.out.println("Quit Browser");
		
	}

}
