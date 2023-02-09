package array_example;

public class _4_MaximumValue {

	public static void main(String[] args) {
	
		int ar[]= {50,60,10,25,20,30,40,-1};
		
		int Max =0;
		int Min =ar[0];
		
		
		for(int i=0;i<ar.length;i++)
		{			
			if(ar[i]>Max)
				{Max=ar[i];}
			
			else if(ar[i]<Min)
				{Min=ar[i];}
		}
		
		System.out.println("Maximum Value inside Array is = "+Max);
		System.out.println("Minimum Value inside Array is = "+Min);
	}

}
