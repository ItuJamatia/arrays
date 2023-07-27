package how_to_sort_an_array;

//Array- it is nothing but a special object that helps to store collection of values.
//Array index always starts with zero.
//Arrays can take default values.
//In java, arrays are objects.

public class A {

	public static void main(String[] args) {

		int []x= {38, 23, 32, 14, 7};			//length is 5
		int temp;
		
		for(int j=0;j<x.length-1;j++) {			//0 to 3 j=0		j=1			j=2			j=3
			for(int i=0; i<x.length-1;i++) {	//0 to 3 i=0123		i=0123		i=0123		i=0123
			if(x[i]>x[i+1]) {
				temp= x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
								}		}}
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
														}}}
