package javaquestion;

import java.util.Random;

public class GenerateRandnoString {

	//private static final String RandomStringUtils = null;

	public static void main(String[] args) {
		 
		//Generate random no
		Random rand=new Random();
		int ran=rand.nextInt(10);
		System.out.println(ran);
		//System.out.println(Math.random());

		//Generate random no
				//Random rand=new Random();
				double ran1=rand.nextDouble();
				System.out.println(ran1);
				
				//Approach 3
				
				System.out.println(Math.random());
				
				//aproach 4
				
			String ranstr=RandomStringUtils.randomNumeric(5);
			String str=RandomStringUtil.randomAlphabetic(4);
			System.out.println(ranstr);
			System.out.println(str);
	}
	

}
