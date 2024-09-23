public class Compare {

    int strike;
    int ball;
    int out;

    public void count(int[] numbers, int[] computerNumber) {
        //반복 시 결과 점수는 0으로 돌아가야하기 때문에 추가로 생성함
        int s = 0;
        int b = 0;
        int o = 0;

        for (int i = 0; i < 3; i++) {
            //스트라이크
            if (computerNumber[i] == numbers[i]) {
                strike ++ ;
                s++;
                continue;
            }

            //아웃
            else if (computerNumber[i] != numbers[0]
                    && computerNumber[i] != numbers[1]
                    && computerNumber[i] != numbers[2]) {
                out++;
                o++;
                continue;
            }

            //볼
            else {
                ball++;
                b++;
                continue;
            }
        }
        //결과창
        System.out.println("[결과]");
        if (s>0) {System.out.println(s + " 스트라이크");
        }
        if (b>0) {System.out.println(b + " 볼");
        }
        if (o>0) {System.out.println(o + " 아웃");
        }

        //현재 스코어
        System.out.println("--------------------------------------");
        System.out.println("[현재 스코어]");
        System.out.println(strike + " 스트라이크 " +  ball + " 볼 " + out + " 아웃 ");
        System.out.println("--------------------------------------");
    }
}
