import java.util.Scanner;
class MoveHypen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;
        int r = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '-') {
                c++;
            }
        }

        for (int i = 0; i < c; i++) {
            System.out.print("-");
        }

        for (int j = r; j < s.length(); j++) {
            if (s.charAt(j) != '-') {
                System.out.print(s.charAt(j));
            }
        }
    }
}
