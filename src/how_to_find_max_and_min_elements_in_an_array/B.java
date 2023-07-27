package how_to_find_max_and_min_elements_in_an_array;

//how to find minimum element in an array

public class B {

	public static void main(String[] args) {
		
		int []x= {10,78,44,25,93};
		int min= x[0];
		
		for(int i=1;i<x.length;i++) {
			if(x[i]<min) {
				min=x[i];
			}
		}
		System.out.println("minimum value is "+min);
		
	}
}
