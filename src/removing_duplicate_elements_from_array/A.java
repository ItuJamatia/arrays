package removing_duplicate_elements_from_array;

//removing duplicate elements from array

public class A {

	public static void main(String[] args) {
		
		int []x= {1,2,2,3,3,4,4};
		int []temp= new int [x.length];
		int j=0;
		
		for(int i=0;i<x.length-1;i++) {	//0 to 5;	6 times
			if(x[i]!=x[i+1]) {			//x[0]!=x[1]
				temp[j]=x[i];			//temp[0]=x[0]
				j++;					//0++
			}
		}	
		temp[j]=x[x.length-1];
		for(int z=0;z<j+1;z++) {		//0 to 3	
			System.out.print(temp[z]);
		}
	}
}
