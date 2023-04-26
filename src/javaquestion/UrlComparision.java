package javaquestion;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlComparision {

	public static void main(String[] args) 
	
	{
		// What will be the output when you compare site URL with its ip address --Ans will give true or false?
	
		try {
			System.out.println(new URL("https:google.com").equals(new URL("https://8.8.8.8")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
