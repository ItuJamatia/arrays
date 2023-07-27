package how_to_find_missing_element;

public class FindMissingElement {

	public static void main(String[] args) {
		
		//Array should not have duplicates
		//Array no need to be in sorted order
		//values should be in range
		
		int [] a= {5,6,8,9};
		
		//1+2+3+4+5=15	sum1
		//1+2+4+5=12 	sum2
		//sum1-sum2	15-12 =	3 missing element
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}System.out.println(sum1);
		
		int sum2=0;
		for(int i=a[0];i<=a[a.length-1];i++) {
			sum2=sum2+i;
		}System.out.println(sum2);
		System.out.println("The missing element is " + (sum2-sum1));
		
	}
	
}
