package String;

public class Stringmanipulation {

	public static void main(String[] args) {
		
		
		String  str="This is my name is bhawna mam";
		str.length();
		System.out.println(str.length());
		System.out.println(str.charAt(5)); // to identify which char  at particular index  o/p :a
		System.out.println(str.indexOf('m')); //1st occurance of m char
		System.out.println(str.indexOf('m',str.indexOf('m')+1));//second occurance of char
	System.out.println(str.indexOf('m',str.indexOf('m',str.indexOf('m')+1)+1)); //3rd occurance of m
	
	System.out.println("Index of particular string "+str.indexOf("is"));
	
	System.out.println("Index of particular string which is not available  "+str.indexOf("good"));   //o/p -1 remeber
	
	//String comparision
	
	String s1="This is good";
	String s2="This Is good";
	
	System.out.println(s1.equals(s2));  //will return true if match exactly o/p-false 
	System.out.println(s1.equalsIgnoreCase(s2));		////will return true if match exactly ignore cases.
	
	//Substring
	
	System.out.println(str.substring(4));// return complte string after 4th index
	
	System.out.println(str.substring(0, 5));  //return substring from 0 to 3 index
	
	//concat 
	
	System.out.println(str.concat(str));
		
	//trim
	String s3="  Hello world ";
	System.out.println(s3.trim());  //trim before and after space 
	System.out.println(s3.replace(" ", "")); //replace space from hello and world
	String date="20-06-2021";
	System.out.println(date.replace("-", "/"));
	
	//split
	
	String split="Hello_world_in_the_selenium";
	String splitarr[]=split.split("_");  //result return in an array
	for(int i=0;i<=splitarr.length;i++)
	{
		System.out.println(splitarr[i]);
	}
	
	}

}
