import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int n = 0;
        String nums;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        n = sc.nextInt();
        sc.nextLine();

        System.out.print("수를 입력하세요: ");
        nums = sc.nextLine();

        String[] numArr = nums.split("\\s+");

        int maxNum = Integer.parseInt(numArr[0]);
        int minNum = Integer.parseInt(numArr[0]);
        for (int i = 1; i < n; i++) {
            int a = Integer.parseInt(numArr[i]);

            maxNum = (maxNum < a) ? a : maxNum;
            minNum = (minNum > a) ? a : minNum;
        }

        System.out.printf("최대값: %d\n", maxNum);
        System.out.printf("최소값: %d\n", minNum);
    }
}