package exercise.curs13.service;

import exercise.curs13.entity.MathEntity;
import exercise.curs13.exception.MathCustomException;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Double doMath(MathEntity math) throws IllegalArgumentException {
        return switch (math.getOperation()) {
            case sum -> math.getFirstNumber() + math.getSecondNumber();
            case difference -> math.getFirstNumber() - math.getSecondNumber();
            case multiply -> math.getFirstNumber() * math.getSecondNumber();
            case divide -> {
                if (math.getSecondNumber() == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                yield math.getFirstNumber() / math.getSecondNumber();
            }
            case power -> Math.pow(math.getFirstNumber(), math.getSecondNumber());
            default -> throw new MathCustomException("Invalid operation");
        };
    }
}
