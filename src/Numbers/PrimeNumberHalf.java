/**
 * 
 */
package Numbers;

/**
 * @author Simran
 *
 */
public class PrimeNumberHalf {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int i,m=0,flag=0;
		int n=14;
		m=n/2;
		if ((n==0) || (n==1))
		{
			System.out.println(n+ " is not Prime Number");	
		}
		else {
			for (i=2;i<=m;i++) {
				if(n%i==0)
					System.out.println(n+ " is not Prime Number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(n+ " is Prime Number");
		}
		
	}

}
