package racingcar.domain;

public class Rule {

    private static final int MIN_ATTEMPT_NUMBER = 1;
    private static final String ATTEMPT_NUMBER_RANGE_ERROR = "[ERROR] 시도 횟수는 0보다 커야 합니다.";
    public int attemptNumber;

    public Rule(int attemptNumber) {
        validateRangeAttemptNumber(attemptNumber);
        this.attemptNumber = attemptNumber;
    }

    private void validateRangeAttemptNumber(int attemptNumber) {
        if (attemptNumber < MIN_ATTEMPT_NUMBER) {
            throw new IllegalArgumentException(ATTEMPT_NUMBER_RANGE_ERROR);
        }
    }
}
