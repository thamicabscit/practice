package javaprograms.strings;

public class UniqueChar {

	public static void main(String[] args) {
		
		String str="Hello World !";
	
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			boolean isUnique=true;
			//comparing one char with all other chars
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && c==str.charAt(j))
				{
					isUnique=false;
					break;
				}
				
			}
			if(isUnique)
			{
				System.out.print(c);
			}
			
		}
		

	}

}
