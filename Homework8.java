import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> IDnPwd = new HashMap<String, String>();
        IDnPwd.put("myId", "myPass");
        IDnPwd.put("myId2", "myPass2");
        IDnPwd.put("myId3", "myPass3");

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String answer = sc.nextLine();
            if (IDnPwd.containsKey(answer)) {
                System.out.print("password : ");
                answer = sc.nextLine();
                if (IDnPwd.containsValue(answer)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                }
            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            }
        }
    }
}
