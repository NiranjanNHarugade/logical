package array_example;


import java.util.HashSet;
import java.util.Set;


public class _5_DuplicatesInArrays {

	public static void main(String[] args) {
		
		
		Method1();
		Method2();
	
		
		
	}
	
		public static void Method1()
		{	
				int ar[]= {50,60,10,20,10,15,20,30,40};
				Set <Integer> sc =new HashSet<>();
				for(int N:ar){ sc.add(N); }
			
				
				for(int i=0;i<ar.length;i++)
				{					
					for(int j=i+1;j<ar.length;j++)
					{
					 //To Remove Duplicate values  -->
						if(ar[i]==ar[j]) {sc.remove(ar[j]);}
						
						
					 // To Find Duplicate values   -->
						if(ar[i]==ar[j]) {System.out.println("1 Duplicat Value inside Array = "+ar[j]);}
					}
						
				}		
				
				System.out.println("1 Array After Removing Duplicates = "+sc);
				
		}
	
			
			
			
		public static void Method2() 
			{	
				int Array[]= {50,60,10,20,10,15,20,30,40};
			
				Set <Integer> SET =new HashSet<Integer>();
				for(int X:Array) 
				{
					  if(SET.add(X)==false)
					  {System.out.println("2 Duplicate Element inside array = "+X);
							SET.remove(X);
					   }
				}
				System.out.println("2 Array After Removing Duplicates = "+SET);	
			}

			
			
			
			
			
			
}

