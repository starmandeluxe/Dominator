
/*
 * Determine if any value in an array is the majority of the elements
 * i.e. greater than N/2 elements
 * return -1 if no majority exists
 */
public class Dominator {

	public static void main(String[] args) {
		System.out.println();

	}
	
	public static int solution(int A[])
	{
		//test edge cases
		if (A.length == 0)
		{
			return -1;
		}
		
		//call helper method to get the majority candidate
		int c = candidate(A, A.length);
		
		int count = 0;
		
		int seenIndex = 0;
		//count the number of times that majority candidate appears
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] == c)
			{
				seenIndex = i;
				count++;
			}
				
		}
		//determine if it is indeed a dominator
		if (count > A.length/2)
		{
			return seenIndex;
		}
		else
			return -1;
	}
	
	
	public static int candidate(int[] arr, int n)
	{
	    int majorityIdx = 0, count = 1;
	 
	    for(int i=1; i<n; i++)
	    {
	        if(arr[majorityIdx] == arr[i])
	            count++;
	        else
	            count--;
	 
	        if(count == 0)
	        {
	            majorityIdx = i;
	            count = 1;
	        }
	    }
	    return arr[majorityIdx];
	}
	
	

}
