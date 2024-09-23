import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    int number;
    int[] numbers = new int[3];


    //입력 메소드
    public int input() {
        System.out.println();
        System.out.println("--------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("세 자리 숫자를 입력하세요: ");

        //문자열 입력시 예외처리
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("[ERROR]올바르지 않는 입력값입니다.");
            System.out.println("--------------------------------------");
            //버퍼 지우기
            scanner.nextLine();
            input();
        }

        //세 자리 정수가 아닐 시 출력값
        if (number > 999) {
            System.out.println("[ERROR]세 자리수가 아닙니다.");
            System.out.println("--------------------------------------");
            input();
        } else if (number<100) {System.out.println("[ERROR]세 자리수가 아닙니다.");
            System.out.println("--------------------------------------");
            input();
        }
        return number;
    }

    public int[] change(int number) {

        String strNumber = Integer.toString(number);
        String[] splitNumber = strNumber.split("");

        //int로 변환하여 배열에 대입
        for (int i = 0; i < splitNumber.length; i++) {

            numbers[i] = Integer.parseInt(splitNumber[i]);
        }

        //중복된 값을 입력 시 경고창
        if (numbers[0] == numbers[1] ||
                numbers[1] == numbers[2] ||
                numbers[0] == numbers[2]) {
            System.out.println("[ERROR]중복된 숫자가 있습니다. 다시 입력하세요");
            System.out.println("--------------------------------------");
            input();
        }
        return numbers;
    }
}