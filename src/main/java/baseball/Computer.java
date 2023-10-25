package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    private static final int INPUT_LENGTH = 3;
    private static final int BASEBALL_MIN_RANGE = 1;
    private static final int BASEBALL_MAX_RANGE = 9;

    int[] computerBaseBallNumber = new int[INPUT_LENGTH];

    public void generateComputerBaseBallNumber() {
        Integer[] randomBaseBallNumber = Randoms
                .pickUniqueNumbersInRange(BASEBALL_MIN_RANGE, BASEBALL_MAX_RANGE, INPUT_LENGTH)
                .toArray(Integer[]::new);
        for (int i = 0; i < INPUT_LENGTH; i++) {
            this.computerBaseBallNumber[i] = randomBaseBallNumber[i];
        }
    }
}
