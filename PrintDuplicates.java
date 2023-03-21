
public class PrintDuplicates {

	public static void main(String[] args) 
	{
		String s="bigbasketapp";
		char[] ch=s.toCharArray();
		System.out.println("duplicated characters from a string");
		 for (int i=0;i<ch.length;i++) 
		 {
			 for(int j = i+1;j<ch.length;j++) 
			 {
				if(ch[i]==ch[j]) 
				{
					System.out.print(ch[i]+" ");
				} 
				
			 }
		 }
	}
}
