import java.util.*;
class ToogleSwitch{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean a[] = new boolean[n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j=j+i)
            {
                if(a[j]==true)

                a[j] = false;
                else
                a[j] = true;
                
            }
        }
        for(int i=1;i<=n;i++)
        {
            if(a[i]==true)
            {
                System.out.print(i+" ");
            }
    }
}
}
