package RotateArray;

public class RotateArray {

//	Rotate an array  for n times then give me the first index after rotation.(anti-clockwise)  
	public static void main(String[] args) {
		int[] array = {2,3,5,6,7};
		int rotations = 12;
		
		while(rotations>0) {
			int first= array[0];
			int i=array.length-1;
			while(array[array.length-1]!=first&&i>0) {
				int temp = array[i];
				array[i]=array[i-1];
				array[i-1]=temp;
				i--;
				
			}
			rotations--;
		}
		System.out.println("First index value after rotation "+array[0]);
	}
}
