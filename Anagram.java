import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter strings to check two are anagrams or not");
		System.out.println("Enter string1");
		String str1=scan.nextLine();
		System.out.println("Enter string2");
		String str2=scan.nextLine();	    
		    str1 = str1.toLowerCase();
		    str2 = str2.toLowerCase();
		    if(str1.length() == str2.length()) // check if length is same
		    {
			      char[] charArray1 = str1.toCharArray();
			      char[] charArray2 = str2.toCharArray();
			      Arrays.sort(charArray1);
			      Arrays.sort(charArray2);
			      boolean flag = Arrays.equals(charArray1, charArray2);

			      if(flag) {
			        System.out.println(str1 + " and " + str2 + " are anagram.");
			      }
			      else {
			        System.out.println(str1 + " and " + str2 + " are not anagram.");
			      }			      
		   }		    
		    else {
		      System.out.println("You entered is not anagram");
		 }
	}

}
