package Concept;
import java.io.*;
/**
 * @author Simran
 *
 */
class ArrayEG{
		
	 public static void main(String args[]) throws IOException{
		 
		 ArrayEG areg=new ArrayEG();
		 areg.arrayFun();
			
		}
	 
	 void arrayFun() throws NumberFormatException, IOException {
		 int i=0;
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader bs=new BufferedReader(is);
			int a[]=new int[5];
			System.out.println("Enter numbers:");
			for(i=0;i<5;i++){
				a[i]=Integer.parseInt(bs.readLine());
			}
			System.out.println("Numbers are:");
			for (i=0;i<5;i++){
				System.out.println(a[i]);
			}
	 }
}
