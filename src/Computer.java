import java.util.Random;

public class Computer {

    int[] computerNumber = new int[3];
    Random random = new Random();

    //난수 생성 메소드
    public void creat() {
        for (int i = 0; i < computerNumber.length; i++) {

            //1~9사이의 난수
            computerNumber[i] = random.nextInt(9)+1;

            //중복된 숫자가 나올 경우 다시 출력
            for (int j = 0; j < i; j++) {
                if (computerNumber[j] == computerNumber[i]) {
                    i--;
                    break;
                }
            }
        }
    }
}
