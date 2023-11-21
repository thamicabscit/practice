package javaprograms.strings;

import java.util.Arrays;

public class DupFreq {

	public static void main(String[] args) {
		
		String str1="HelloWorld";
		char[] str=str1.toCharArray();
		Arrays.sort(str);
		int j;
		for(int i=0;i<str.length;i++)
		{
			int freq=1;
			for( j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					freq++;
				}
				else
				{
					break;
				}
			}
			
			i=j-1;
			if(freq>1)
			{
				System.out.println(str[i]+"count"+freq);
			}
			
		}

	}

}
