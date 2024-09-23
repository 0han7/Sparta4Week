import java.util.InputMismatchException;
import java.util.Scanner;

public class Title {
    Scanner scanner = new Scanner(System.in);
    int number;


    //첫 메인화면 메소드
    public int mainTitle() {
        System.out.println("--------------------------------------");
        System.out.println("< 환영합니다! 원하시는 번호를 입력해주세요 >");
        System.out.println("[1. 게임 시작하기] [2. 게임 기록 보기] [3. 종료하기]");
        System.out.print("입력 : ");

        //문자열 입력 예외처리
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("[ERROR]올바르지 않는 입력값입니다.");
            System.out.println("--------------------------------------");
            //버퍼 지우기
            scanner.nextLine();
            mainTitle();
        }
        return number;
    }


    //입력값에 따른 출력창
    public void choice(int number) {
        while (true) {
            if (number == 1) {
                System.out.println("<게임을 시작합니다.>");
                break;
            }


            if (number == 2) {
                System.out.println("아직 미완성입니다.");
                System.exit(0);
            }

            if (number == 3) {
                System.out.println("<게임을 종료합니다.>");
                System.exit(0);

                //다른 입력값을 넣었을 경우
            } else {
                System.out.println("[ERROR]잘못된 번호입니다.");
                System.out.println("--------------------------------------");
                System.out.println();
                System.exit(0);
            }
        }
    }
}
