import java.util.*;
public class AliceApppleTree
{
	public static void main(String[] args) {
		int n,s,e,w,k,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s=sc.nextInt();
		e=sc.nextInt();
		w=sc.nextInt();
		k=sc.nextInt();
		m=sc.nextInt();
		int res=minapple(n,s,e,w,k,m);
		System.out.println(res);
	}
	public static int minapple(int n,int s,int e, int w,int k,int m)
	{
	    if(m<=s*k)
	    {
	        return m;
	    }
	    else if(m<=s*k+e+w)
	    {
	        return (s*k+(e+w)*k);
	    }
	    else{
	        return -1;
	    }
	}
}
