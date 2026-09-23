import java.util.Scanner;

class Student {
    int studentNumber = 202510784;
    String studentName = "홍길동";
    String major = "컴퓨터과학전공";
    int phoneNumber = 1012341234;

    void setStudentNumber(int stn) {
        studentNumber = stn;
    }
    void setStudentName(String stnm) {
        studentName = stnm;
    }
    void setMajor(String maj) {
        major = maj;
    }
    void setPhoneNumber(int pnum) {
        phoneNumber = pnum;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Student[] stds = new Student[3];

        for (int i = 0; i < 3; i++) {
            stds[i] = new Student();
            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            Scanner sc = new Scanner(System.in);
            stds[i].setStudentNumber(Integer.parseInt(sc.next()));
            stds[i].setStudentName(sc.next());
            stds[i].setMajor(sc.next());
            stds[i].setPhoneNumber(Integer.parseInt(sc.next()));
        }
        System.out.printf("입력된 학생들의 정보는 다음과 같습니다.\n");
        for (int i = 0; i < 3; i++) {
            String pnum = "0" + Integer.toString(stds[i].phoneNumber);
            pnum = pnum.substring(0, 3) + "-"
                    + pnum.substring(3, 7) + "-"
                    + pnum.substring(7);
            System.out.printf("%d번째 학생: %s %s %s %s\n",
                    i+1,
                    Integer.toString(stds[i].studentNumber),
                    stds[i].studentName,
                    stds[i].major,
                    pnum);
        }
    }
}