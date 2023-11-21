package javaprograms.strings;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str="Hello World";
		
		//convert string into char array
		char[] strarray=str.toCharArray();
		int i,j;
	
		for(i=0,j=strarray.length-1;i<j;i++,j--)
			
		{
			
			char temp=strarray[i];
			strarray[i]=strarray[j];
			strarray[j]=temp;
			
			
		}
	
		//again convert char array to string
		
		String res=new String(strarray);
		System.out.println(res);
		

	}

}
