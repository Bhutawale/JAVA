package com.method;

public class String_DistanceBetweenWords
{
	public int distance(String str,String w1,String w2)
	{	
		String[] split = str.split(" ");
		int distance=split.length+1;
		if(w1.equals(w2)) {
			return 0;
		}
		for(int i=0;i<split.length;i++)
		{
			if(split[i].equals(w1))
			{
				for(int j=0;j<split.length;j++)
				{
					if(split[j].equals(w2))
					{
						int dis=Math.abs(i-j)-1;
						if(dis<distance)
						{
							distance=dis;
						}
					}
				}
			}
		}
		return distance;
	}
	public static void main(String[] args) {
		String str="use cloudtech for learning java";
		String w1="for";
		String w2="java";
		System.out.println("Given String is: "+str);
		String_DistanceBetweenWords w=new String_DistanceBetweenWords();
		int distance = w.distance(str,w1,w2);
		System.out.println("Distance between "+w1+" and "+w2+" is : "+distance);
	}
}
