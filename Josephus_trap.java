import java.util.Scanner;

class Josephus_trap
{
	static int josephus(int N, int K)
	{
		if (N == 1)
		{
			return 0;
		}
		else
		{
		    return (josephus(N - 1, K) + K ) % N ;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("No. people: ");
		int N = sc.nextInt();
		System.out.println("Killing factor: ");
		int K = sc.nextInt();
		sc.close();
		System.out.println("Remaining person index: " + josephus(N, K));
	}
}


