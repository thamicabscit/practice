package javaprograms.strings;

import java.util.Scanner;

//public class FreqVowelsCons {
//
//	public static void main(String[] args) {
//	
//		
//		String str="HelloWorld";
//		str=str.toLowerCase();
//		int a=0,e=0,I=0,o=0,u=0;
//		int cons=0;
//		
//		for(int i=0;i<str.length();i++)
//		{
//			char ch=str.charAt(i);
//			if(ch=='a')
//			{
//				a++;
//			}
//			else if(ch=='e')
//			{
//				e++;
//			}
//			else if(ch=='i')
//			{
//				I++;
//			}
//			else if(ch=='o')
//			{
//				o++;
//			}
//			else if(ch=='u')
//			{
//				u++;
//			}
//			else
//			{
//			cons++;	
//			}
//			
//		}
//		System.out.println("a"+a);
//		System.out.println("e"+e);
//		System.out.println("i"+I);
//		System.out.println("o"+o);
//		System.out.println("u"+u);
//		System.out.println("cons"+cons);
//		
//
//	}
//
//}





import java.util.Scanner;

public class FreqVowelsCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int[] vowelFreq = new int[5]; // Array to store frequency of vowels
        char[] vowels = new char[5]; // Array to store unique vowels

        // Convert the string to lowercase to count uppercase letters as lowercase as well
        str = str.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            { // Check if the character is a vowel
                boolean isVowelPresent = false;
                for (int j = 0; j < vowels.length; j++)
                {
                    if (vowels[j] == ch) 
                    { // Check if the vowel is already in the array
                        isVowelPresent = true;
                        vowelFreq[j]++;
                        break;
                    }
                }
                if (!isVowelPresent)
                { // If the vowel is not already in the array, add it
                    for (int j = 0; j < vowels.length; j++)
                    {
                        if (vowels[j] == 0) {
                            vowels[j] = ch;
                            vowelFreq[j]++;
                            break;
                        }
                    }
                }
              
            }
           
        }

        // Display the frequency of each vowel
        System.out.println("Frequency of vowels: ");
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] != 0) {
                System.out.println(vowels[i] + " : " + vowelFreq[i]);
            }
        }
    }
}

