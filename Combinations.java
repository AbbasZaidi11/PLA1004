import java.util.*;

public class Main
{
    public static void combination(int arr[],int data[],int start,int end,int index,int r)
    {
        
        if (index==r)
        {
            for(int i=0;i<r;i++)
            {
                System.out.print(data[i]+" ");
            }
            System.out.println(" ");
            return;
        }
    
        for(int i=start;i<=end;i++)
        {
            data[index]=arr[i];
            combination(arr,data,i+1,end,index+1,r);
        }
    }
    
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
	    int arr[]=new int [n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=input.nextInt();
	        
	    }
	    int r=input.nextInt();
	    int data[]=new int[r];
	    combination(arr,data,0,n-1,0,r);
	    
	}
}
