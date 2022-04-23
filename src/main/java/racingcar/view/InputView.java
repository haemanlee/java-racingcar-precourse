package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Pattern;

public class InputView {
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

    private InputView() {}

    public static int askTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();
        if(!isNumeric(input)){
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
        return Integer.parseInt(input);
    }

    public static String askCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return Console.readLine();
    }
}
