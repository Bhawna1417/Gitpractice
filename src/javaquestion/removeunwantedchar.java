package javaquestion;

public class removeunwantedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "@#$%  bhawna";
s=s.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(s);
	}

}
