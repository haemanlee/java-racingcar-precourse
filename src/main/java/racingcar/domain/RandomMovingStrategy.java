package racingcar.domain;


import camp.nextstep.edu.missionutils.Randoms;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy{
    private static final int FINAL_NUM = 10;
    private static final int FORWARD_NUM = 4;
    private final Random random = new Random();


    @Override
    public boolean movable() {
        return getRandomNumber() >= FORWARD_NUM;
    }

    private int getRandomNumber(){
        return Randoms.pickNumberInRange(FORWARD_NUM, FINAL_NUM);
    }
}
