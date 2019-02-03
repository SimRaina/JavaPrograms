package array;

import java.util.Scanner;

public class MergingArrays {
		public static void main(String args[]) {
			int size1, size2, size,i,k;
			int arr1[]=new int[5];
			int arr2[]=new int[5];
			int merge[]=new int[10];
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Array1 size");
			size1=scan.nextInt();
			
			System.out.println("Enter Array2 size");
			size2=scan.nextInt();
			
			System.out.println("Enter Array1 elements");
			for(i=0;i<size1;i++) {
				arr1[i]=scan.nextInt();
			}
			System.out.println("Enter Array2 elements");
			for(i=0;i<size2;i++) {
				arr2[i]=scan.nextInt();
			}
			
			System.out.println("Merging the arrays....\n");
			for(i=0;i<size1;i++) {
				merge[i]=arr1[i];
			}
			
			size=size1+size2;
			
			for(i=0,k=size1; i<size2 && k<size; i++,k++) {
				merge[k]=arr2[i];
			}
			
			System.out.println("Merged Arrays");
			for(i=0; i<size; i++) {
				System.out.println(merge[i]+" ");
				
			}
			scan.close();
		}
}
