import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a=161,b=28,r=0,q=0;
	    int s1,s2,t1,t2,s,t;
	    s1=1;s2=0;t1=0;t2=1;
	    while(a!=0 && b!=0){
	        r=a%b;
	        q=a/b;
	        s=(s1-s2*q);
	        t=(t1-t2*q);
	        a=b;
	        b=r;
	        s1=s2;
	        s2=s;
	        t1=t2;
	        t2=t;
	        System.out.println(s1+" "+t1);
	    }
	    System.out.println(a+" "+b);
	}
}
