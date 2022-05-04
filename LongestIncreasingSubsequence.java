package com.subsequence;

public class LongestIncreasingSubsequence {
	
	public static int longestIncreasingSub(int arr[], int len)
	{
		int count, max = 0, temp;
		if(len == 1)
		{
			return 1;
		}
		
		for(int i = 0; i < len; i++)
		{
			count = 1;
			temp = i;
			for(int j = i+1; j < len; j++)
			{
				if(arr[i] < arr[j])
				{
					count++;
					i=j;
				}
			}
			
			if(max < count)
			{
				max = count;
			}
			
			i = temp;
			
			if((len - i) < max)
			{
				break;
			}
		}
		return max;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 1, 2, 4, 9, 12, 6, 9, 10};
		int len = arr.length;
		System.out.println(longestIncreasingSub(arr, len));
	}

}
