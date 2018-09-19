import java.util.Arrays;

public class Lab4 {
	
	public static void main(String args[])
	{
		int[] input1 = {37,12,17,59};
		//int[] input2=null;
		int [] input3= {1,1,1,1};
		int [] input4;
		int [] input5;
	
		int [] output1 =sortArray(input1);
		//int[] output2=sortArray(input2);
		int [] output3=sortArray(input3);
		
		for (int item:output1)
		{
			System.out.print(item+" ");
		}
		
		System.out.println("");
		
		for (int item:output3)
		{
			System.out.print(item+" ");
		}
	
	
	}
	
	
		public static int [] sortArray(int [] inputArray)
		{
			//make a copy of inputArray
			int [] copyArray=inputArray.clone();
			//sort the copy
			int temp;
			for (int i=0; i<copyArray.length-1; i++)
			{
				if(copyArray[i]<copyArray[i+1])
				{
					temp=copyArray[i];
					copyArray[i]=copyArray[i+1];
					copyArray[i+1]=temp;
					i=-1;
						
				}
			}
			return copyArray;
		}
	
	
}