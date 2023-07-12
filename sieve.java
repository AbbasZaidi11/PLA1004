import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		csieve(t);
		
	}
	static int N=1000000;
	static boolean sieve[]=new boolean[100000000];
	static void csieve(int n)
	{
	    for(int i=2;i<=N;i++)
	    {
	        sieve[i]=true;
	    }
	    for(int i=2;i*i<=N;i++)
	    {
	        if(sieve[i]==true)
	        {
	        for(int j=i*i;j<=N;j=j+i)
	        {
	            sieve[j]=false;
	        }
	    }
	    }
	    for (int i = 2; i <= n; i++) {
            if (sieve[i] == true)
                System.out.print(i + " ");
        }
	}
}
