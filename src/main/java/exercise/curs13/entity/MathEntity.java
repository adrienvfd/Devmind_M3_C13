package exercise.curs13.entity;

import exercise.curs13.enums.OperationEnum;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MathEntity {
    private Double firstNumber;
    private Double secondNumber;
    private OperationEnum operation;
}
