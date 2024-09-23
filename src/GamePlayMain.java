public class GamePlayMain {

    public static void main(String[] args) {
        User user = new User();
        Computer computer = new Computer();
        Compare compare = new Compare();
        Title title = new Title();


        //메인 화면
        title.mainTitle();
        title.choice(title.number);

        //난수 지정
        computer.creat();

        //난수와 입력값 비교
        while (true) {
            //입력 메소드
            user.input();
            user.change(user.number);
            System.out.println();

            //비교 후 점수 카운트
            compare.count(user.numbers, computer.computerNumber);
            System.out.println();

            //모두 맞출 경우 게임 종료
            if (computer.computerNumber[0] == user.numbers[0]
                    && computer.computerNumber[1] == user.numbers[1]
                    && computer.computerNumber[2] == user.numbers[2]) {
                System.out.println("정답입니다! 게임을 종료합니다.");
                break;
            }
            //쓰리 아웃일 때 게임 종료
            if (compare.out >= 3) {
                System.out.println("정답: "+ computer.computerNumber[0]+ computer.computerNumber[1]+ computer.computerNumber[2]);
                System.out.println("쓰리 아웃입니다! 게임을 종료합니다." );
                break;
            }

        }

    }
}