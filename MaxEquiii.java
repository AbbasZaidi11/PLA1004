import java.util.*;
class MaxEquiii{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         int res=MaxEqui(n,a);
         System.out.print(res);
    }
    public static int MaxEqui(int n, int a[])
    {
        int LeftSum=0;
        int TotalSum=0;
        for(int i=0;i<n;i++)
        {
            TotalSum=TotalSum+a[i];
        }
        for(int i=0;i<n;i++)
        {
            TotalSum=TotalSum-a[i];

            if(LeftSum==TotalSum)
            {
                return i;
            }
            LeftSum=LeftSum+a[i];
        }
        return 0;
    }
}