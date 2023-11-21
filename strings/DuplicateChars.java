package javaprograms.strings;

public class DuplicateChars {

	public static void main(String[] args) {
		
		String str="HelloWorld";
		//to convert string into character array
		char str1[]=str.toCharArray();
		
		for(int i=0;i<str1.length;i++)
		{
			int count=1,freq=1;
			//to comparing current char(i) with all other chars(j) in the string
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i]==str1[j]&&str1[i]!=' ')
				{
					//if index 0(i=0) and index 1(j=1) is equal then the count will increase to 2 
					// as count is initialize to 1 
					//bcaz count=1 means unique 
					count++;
					freq++;
					//to avoid printing already printed char ( l count is 3 no need to print 3 l's)
					str1[j]='0';
				}
			}
			//count is greater than 1 means duplicates 
			if(count>1 && str1[i]!='0'&& freq>1)
			{
				System.out.println(str1[i]+"count "+freq);
			}
		}
		
		
		
		
		
		
	}
}
