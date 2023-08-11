import java.util.*;
public class RatMaze {
    public static int findpath(int a[][], int i, int j, int n, int path[][]) {
        if (i == n - 1 && j == n - 1 && a[i][j] == 1) {
            path[i][j] = 1;
            return 1;
        }
        if (i >= 0 && i < n && j >= 0 && j < n && a[i][j] == 1) {
            path[i][j] = 1;
            if (findpath(a, i + 1, j, n, path) == 1)
                return 1;
            if (findpath(a, i, j + 1, n, path) == 1)
                return 1;
            path[i][j] = 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int path[][] = new int[n][n];
        findpath(a, 0, 0, n, path);
     System.out.println(" The Output is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
    }
}
