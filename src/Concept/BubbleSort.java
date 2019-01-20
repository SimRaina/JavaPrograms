package Concept;
import java.io.*;
/**
 * @author Simran
 *
 */

class BubbleSort{
		public static void main(String args[]) throws IOException{
				int a[]=new int[10];
				int t;
				InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(isr);
				System.out.println("Enter numbers:");
				for(int i=0;i<10;i++)
					a[i]=Integer.parseInt(br.readLine());
				for(int m=0;m<10;m++)
					for(int n=m+1;n<10;n++)
					{
							if(a[m]>a[n]){
								t=a[m];
								a[m]=a[n];
								a[n]=t;
							}
					}
				System.out.println("Sorted numbers are:");
				for(int j=0;j<10;j++)
					System.out.println(a[j]);
		}
}