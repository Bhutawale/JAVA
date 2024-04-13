package com.method;

public class String_CountVowelsConsonents
{
	public static void main(String[] args) 
	{
		 char[] vowel= {'a','e','i','o','u'};
		 int count_vowel=0;
		 int count_consonants=0;
		 String str="satish";
		
		 char[] cs = str.toCharArray();
		 
		 for(int i=0;i<cs.length;i++)
		 {
			 boolean flag=false;
			 for(int j=0;j<vowel.length;j++)
			 {
				 if(cs[i]==vowel[j])
				 {
					 flag=true;
					 break;
				 }
			 }
			 if(flag)
			 {
				 count_vowel++;
			 }
			 else
			 {
				 count_consonants++;
			 }
		 }
		 System.out.println("Total Vowel: "+count_vowel);
		 System.out.println("Total Consonants: "+count_consonants);
	}
	
}
