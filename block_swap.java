import java.util.*; 
class Main{    
    public static void swap(int arr[], int a, int b, int r){ 
      0,1 //for(int i = 0 ; i < r ; i++){ //a=0,b=3,r=2
            int temp = arr[a + i]; 
            arr[a + i] = arr[b + i]; 
            arr[b + i] = temp; 
        } 
        } 
    public static void leftRotate(int arr[], int r){ 
        int n = arr.length;
        if(r == 0 || r == n) return;   
        int A = r; 
        int B = n - r;    
        while (A!= B){
            if(A < B){2<1 
                swap(arr, r-A, A+B-r, A);
                B= B - A ;}
            else{ 
                swap(arr, r-A, r, B);
                A = A- B;  } 
        }
        swap(arr, r-A, r, B);
    }
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = s.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        
        System.out.println("Enter the number of rotations");
        int no_of_rotations = s.nextInt();
        
        leftRotate(arr, no_of_rotations); //ARR,2
        
        System.out.println("Array Elements after rotating : "); 
        for(int i = 0 ; i < n ; i++){   
            System.out.print(arr[i] + " "); 
        }
    }  
}
