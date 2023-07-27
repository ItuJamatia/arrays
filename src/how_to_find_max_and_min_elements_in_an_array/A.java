package how_to_find_max_and_min_elements_in_an_array;

//how to sort an array and find maximum, minimum, 2nd smallest, 2nd  largest element in an array

public class A {
	public static void main(String[] args) {
		
		int [] a= {6,8,2,4,3,1,5,7};	
		int temp;						
		
		for(int i=0;i<a.length;i++) {			//a[i]=0,1,2,3,4,5,6,7
			for(int j=i+1;j<a.length;j++) {		//a[j]=1,2,3,4,5,6
				
				if(a[i]>a[j]) {	
					temp=a[i];					
					a[i]=a[j];
					a[j]=temp;						 
				}				
			}	System.out.println(" " + a[i]);				
		}	
		System.out.println("the smallest element is " +a[0]);
		System.out.println("the second smallest element is " +a[1]);
		System.out.println("the second largest element is " +a[6]);
		System.out.println("the largest element is " +a[7]);
}
}
