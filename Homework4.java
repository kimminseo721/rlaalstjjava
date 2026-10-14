import java.util.Scanner;

public class Homework4 {
    int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > b)
            return gcd(a % b, b);
        else
            return gcd(a, b % a);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        String input = sc.nextLine();
        String[] inputs = input.split("\\s+");

        a = Integer.parseInt(inputs[0]);
        b = Integer.parseInt(inputs[1]);

        Homework4 hw = new Homework4();
        System.out.printf("두 수의 최대공약수는 %d입니다.", hw.gcd(a, b));
    }
}
