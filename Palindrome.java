
public class Palindrome {

	public static void main(String[] args) {
		
		String s="2552";
		String s1="";
		
		for (int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1)) {
			System.out.println("it's a palindrome");
		}
		else {
			System.out.println("it's not a palindrome");
		}
	}

}
